package com.web.mes_tire.Process.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.web.mes_tire.Process.vo.Ext;
import com.web.mes_tire.Process.vo.Har3;


@Mapper
public interface ExtDao {
	
	// 공정 전체 출력 + 예외 상황 로그's 예외 유형
		@Select("SELECT p.*, e.EXCEPTION_TYPE\r\n"
				+ "FROM PROCESS p , EXCEPTION_LOG e\r\n"
				+ "WHERE p.TYPENO = e.TYPENO(+)"
				+ " order by p.line")
		List<Ext> getList();
		
		// 클릭시 상세 정보
		@Select("SELECT p.*, e.EXCEPTION_TYPE\r\n"
				+ "FROM PROCESS p , EXCEPTION_LOG e\r\n"
				+ "WHERE p.TYPENO = e.TYPENO(+)\r\n"
				+ "AND line = #{line}")
		Ext getDetail(@Param("line") int line);
		
		@Update(" UPDATE process \r\n"
				+ " 	SET cnt = cnt +1\r\n"
				+ " 	WHERE line = #{line}")
		int CntUpdate(@Param("line") int line);
			
			
//		@Insert("INSERT INTO PROCESS VALUES(\r\n"
//				+ "	#{id},\r\n"
//				+ "#{process_name},\r\n"
//				+ "	#{invno},\r\n"
//				+ "	#{rubbera},\r\n"
//				+ "	#{rubberb},\r\n"
//				+ "	#{rubbera1}, \r\n"
//				+ "	#{rubberb1},\r\n"
//				+ "	#{startdte},\r\n"
//				+ "	#{enddte},\r\n"
//				+ "	1,\r\n"
//				+ "	#{typeno},\r\n"
//				+ "	line_seq.nextval)")
//		int insertPro(Ext ins);
		
		@Insert("INSERT INTO process (id, process_name, invno, rubbera, rubberb, rubbera1, rubberb1, " +
		        "startdte, enddte, cnt, typeno, line) " +
		        "SELECT " +
		        "1, " +  
		        "'혼합', " +  
		        "#{rm.invno}, " + 
		        "5, " +  
		        "20, " +  
		        "#{rm.rubbera1}, " + 
		        "#{rm.rubberb1}, " + 
		        "i.inv_startdate, " +  
		        "i.inv_enddate, " +  
		        "#{rm.cnt}, " +  
		        "#{rm.typeno}, " +  
		        "line_seq.nextval " + 
		        "FROM invoice i " +
		        "WHERE i.invno = #{rm.invno}")  
		int insertPro(@Param("rm") Ext rm);
	
//@Insert("INSERT INTO process (id, process_name, invno, rubbera, rubberb, rubbera1, rubberb1, " +
//        "startdte, enddte, cnt, typeno, line) " +
//        "SELECT " +
//        "1, " +  
//        "'혼합', " +  
//        "#{invno}, " + 
//        "5, " +  
//        "20, " +  
//        "#{rubbera1}, " + 
//        "#{rubberb1}, " + 
//        "i.inv_startdate as startdte, " +  
//        "i.inv_enddate as enddte, " +  
//        "#{cnt}, " +  
//        "#{typeno}, " +  
//        "line_seq.nextval " + 
//        "FROM invoice i " +
//        "WHERE i.invno IS NOT NULL")  
//int insertPro(Ext ins); 
	
	// invno를 반복적으로 저장 시도 but 2002만 저장 가능

		
		// 일련번호 + 전체 리스트
		@Select("SELECT id || '-A-' || TO_CHAR(line_seq.nextval) AS sjd, p.*\r\n"
				+ "FROM process p")
		List<Ext> getListNo();

	
	
	
}
