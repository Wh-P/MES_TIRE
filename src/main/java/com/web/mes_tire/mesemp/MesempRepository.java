package com.web.mes_tire.mesemp;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface MesempRepository {
	
	@Select("SELECT * FROM mesemp WHERE EMPNO=#{empno} and pwd=#{pwd}")
	Mesemp login(Mesemp login);
	
	@Select("SELECT * FROM mesemp")
	List<Mesemp> getMesListAll();
	
	@Select("SELECT * \r\n"
			+ "FROM mesemp\r\n"
			+ "WHERE job LIKE #{job}\r\n"
			+ "AND ename LIKE #{ename}"
			+ "order by empno")
	List<Mesemp> getMesemp(Mesemp sch);
	
	
	@Insert(" INSERT INTO mesemp values(mesemp_seq.nextval,#{mgr},#{auth},\r\n"
			+ "#{job},#{ename},#{pnumber},#{pwd},#{dept},#{deptno})")
	int insertMesemp(Mesemp ins);
	
	
	@Select("SELECT * FROM mesemp where empno=#{empno}")
	Mesemp getMesempList(@Param("empno")int empno);
	
	
	@Update("UPDATE mesemp set mgr=#{mgr},auth=#{auth},job=#{job},ename=#{ename},"
			+ "pnumber=#{pnumber},pwd=#{pwd},dept=#{dept},deptno=#{deptno} where empno=#{empno}")
	int updateMesemp(Mesemp upt);
	
	@Delete("DELETE FROM mesemp WHERE empno=#{empno}")
	int deleteMesemp(@Param("empno") int empno);
}
