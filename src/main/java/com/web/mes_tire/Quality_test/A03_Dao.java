package com.web.mes_tire.Quality_test;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.web.mes_tire.Quality_test.vo.Centertest;
import com.web.mes_tire.Quality_test.vo.Performance_standard;
import com.web.mes_tire.Quality_test.vo.ResultList;
import com.web.mes_tire.Quality_test.vo.Visualtest;

@Mapper
public interface A03_Dao {
		@Select("SELECT * FROM visualtest ORDER BY orderno")
		List<Visualtest> getVisualtest();		
		@Insert("insert into visualtest "
				+ " values(#{orderno},#{trycnt},"
				+ "#{error1cnt},#{error2cnt},#{error3cnt})")
		int insVisualtest(Visualtest ins);
		//=========================================================
		@Select("SELECT * FROM performance_standard ORDER BY weight")
		List<Performance_standard> getPerformance_standardList();
		//=======================================================================
		@Select("SELECT * FROM centertest ORDER BY code")
		List<Centertest> getCentertest();
		
		@Insert("INSERT INTO centertest values(code_seq.nextval,#{deviation},#{error_rate})")
		int insCentertest(Centertest ins);
		
		@Select("SELECT v.ORDERNO ,v.TRYCNT ,(v.ERROR1CNT+v.ERROR2CNT+v.ERROR3CNT) error1sum,CEIL(TRYCNT*0.02) error2sum,\r\n"
				+ "round(((v.ERROR1CNT+v.ERROR2CNT+v.ERROR3CNT)/v.TRYCNT+0.02),2) percentsum,\r\n"
				+ "round((1-(v.ERROR1CNT+v.ERROR2CNT+v.ERROR3CNT)/v.TRYCNT+0.02)*TRYCNT,0) totalyield\r\n"
				+ "FROM VISUALTEST v\r\n"
				+ "ORDER BY orderno")
		List<ResultList> getResultList();

		
}
