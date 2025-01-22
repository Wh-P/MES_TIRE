package com.web.mes_tire.Process.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.web.mes_tire.Process.vo.Har3;

@Mapper
public interface HarDao {
	
	// 예외 상황 로그 조인 출력 전체
	@Select("SELECT h.*, e.EXCEPTION_TYPE\r\n"
			+ "	FROM Hardening h , EXCEPTION_LOG e\r\n"
			+ "	WHERE h.TYPENO = e.TYPENO(+)"
			+ " order by h.line")
	List<Har3> getList2();
	
	
	
//	@Insert("INSERT INTO Hardening values(\r\n"
//			+ "	#{id},\r\n"
//			+ "	#{process_name},\r\n"
//			+ "	#{invno},\r\n"
//			+ "	#{mass},\r\n"
//			+ "	#{radius},\r\n"
//			+ "	#{area},\r\n"
//			+ "	#{pressure},\r\n"
//			+ "	#{pressureRange},\r\n"
//			+ "	#{tension},\r\n"
//			+ "	#{cnt},\r\n"
//			+ "	#{startdte1},\r\n"
//			+ "	#{enddte1},\r\n"
//			+ "	#{typeno},\r\n"
//			+ "	line2_seq.nextval\r\n"
//			+ "	)")
//	int insertList2(Har3 ins);
	
	@Insert("INSERT INTO hardening (id,process_name,invno,mass,radius,area ,pressure,pressureRange,\r\n"
			+ "	tension,cnt,startdte1, enddte1, typeno, line)\r\n"
			+ "				SELECT \r\n"
			+ "					   2,\r\n"
			+ "					   '경화',\r\n"
			+ "					   #{invno}, \r\n"
			+ "					   2.0,\r\n"
			+ "					   0.5,\r\n"
			+ "					   0.1,\r\n"
			+ "					   #{pressure},\r\n"
			+ "					   #{pressureRange},\r\n"
			+ "					   #{tension},\r\n"
			+ "					   1,\r\n"
			+ "				       i.inv_startdate AS startdte1, -- invoice 테이블의 inv_startdate\r\n"
			+ "				       i.inv_enddate AS enddte1,     -- invoice 테이블의 inv_enddate\r\n"
			+ "				       1,\r\n"
			+ "				       line2_seq.nextval             -- line 컬럼에 기본값 삽입\r\n"
			+ "				FROM invoice i\r\n"
			+ "				WHERE i.invno IS NOT NULL")
	int insertList2(Har3 ins);
	
	
	
	// 예외 상황 상세 페이지
	@Select("SELECT h.*, e.EXCEPTION_TYPE\r\n"
			+ "FROM Hardening h , EXCEPTION_LOG e\r\n"
			+ "WHERE h.TYPENO = e.TYPENO(+)\r\n"
			+ "AND line = #{line}")
	Har3 getDetail2(@Param("line") int line);
	
	
	// 생산량 증가
	@Update(" UPDATE Hardening \r\n"
			+ " SET cnt = cnt +1\r\n"
			+ " WHERE line = #{line}")
	int CntUpdate2(@Param("line") int line);
	
	
	
	
}
