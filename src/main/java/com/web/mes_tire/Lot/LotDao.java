package com.web.mes_tire.Lot;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface LotDao {
	@Select("""
select m.*,nvl((SELECT sum(quantity) FROM inbound i WHERE i.materialid=m.materialid),0) as quantity,
nvl((SELECT sum(quantity) FROM inbound i WHERE i.materialid=m.materialid),0)-safety AS safenow
from material m where mname like #{mname} order by safenow
			""")
	List<Material> getMaterialList(Material sch);
	
	@Insert("""
			insert into material (materialid,mname,unit,price,safety,lastck) values(mat_seq.nextval,#{mname},
			#{unit},#{price},#{safety},sysdate)
			""")
	int insertMaterial(Material ins);
	
	@Insert("""
insert into pro_type values(ptype_seq.nextval,#{pname},#{price},
#{mat1},#{mat1_vol},#{mat2},#{mat2_vol},#{mat3},#{mat3_vol})
			""")
	int insertPtype(Pro_type ins);
	
	
	
	@Update("""
update material set mname=#{mname},unit=#{unit},price=#{price},
safety=#{safety},lastck=sysdate where materialid=#{materialid}
			""")
	int updateMaterial(Material upt);
	
	@Delete("delete material where materialid = #{materialid}")
	int deleteMaterial(Material id);
	
	@Select("select * from inbound where materialid=#{id} and quantity > 0 order by indate")
	List<Inbound> getInboundList(@Param("id") int id);
	
	@Select("select * from inbound where quantity > 0 order by indate")
	List<Inbound> getInbList();
	
	@Select("select * from outbound")
	List<Outbound> getOutbList();
	
	@Select("select * from outbound where ptype=#{id} order by outdate desc")
	List<Outbound> getOutboundList(@Param("id") int id);

	@Select("select pt.*, (select sum(quantity) from product p where p.ptype=pt.ptype) AS quantity from pro_type pt "
			+ " where pname like #{pname}")
	List<Pro_type> getPtypeList(Pro_type sch);
	
	@Select ("select * from product where ptype = #{ptype}")
	List<Product> getProductList(@Param("ptype") int ptype);
	
	@Select("select * from material where materialid=#{id}")
	Material getMaterial(@Param("id") int id);
	
	@Select("select * from product where productid=#{id}")
	Product getProduct(@Param("id") int id);
	
	@Select("select * from pro_type where ptype = #{id}")
	Pro_type getPtype(@Param("id") int id);
	
	@Select("select * from inbound where inboundid = #{id}")
	Inbound getInbound(@Param("id") int id);
	
	@Select("select * from outbound where outboundid = #{id}")
	Outbound getOutbound(@Param("id") int id);
	
	@Insert("""
			insert into inbound values(in_seq.nextval,#{orderno},
			#{materialid},#{received},#{quantity},sysdate,#{manager},#{remarks})
			""")
	int insertInbound(Inbound ins);
	
	@Insert("""
			insert into outbound values(out_seq.nextval,#{orderno},#{ptype},
			#{send},#{outdate},#{manager},#{remarks})
			""")
	int insertOutbound(Pro_type ins);
	
	@Select("""
WITH date_params AS (
    SELECT TO_DATE('2024-11-01', 'YYYY-MM-DD') AS start_date, '2024-11' AS label FROM dual
    UNION ALL
    SELECT ADD_MONTHS(TO_DATE('2024-11-01', 'YYYY-MM-DD'),1) , '2024-12' FROM dual
    UNION ALL
    SELECT ADD_MONTHS(TO_DATE('2024-11-01', 'YYYY-MM-DD'),2), '2025-01' FROM dual
)
SELECT 
    dp.label,
    dp.start_date,
   nvl( (SELECT SUM(total) 
     FROM inbound 
     WHERE indate >= dp.start_date
       AND indate < dp.start_date + INTERVAL '1' MONTH),0) AS tot_in,
  nvl(  (SELECT SUM(total) 
     FROM outbound 
     WHERE outdate >= dp.start_date
       AND outdate < dp.start_date + INTERVAL '1' MONTH),0 )AS tot_out
FROM date_params dp
         """)
   List<Lot_log> getLogList();
}
