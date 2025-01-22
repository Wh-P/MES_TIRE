package com.web.mes_tire.Error;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface Error_Dao {

	
	@Select("SELECT * FROM error ORDER BY id ")
	List<Error> getErrorList(Error sch);
	
	// ckId () id 유효성 검사
	@Select("SELECT * FROM error WHERE id = #{id}")
	Error ckId(@Param("id") int id);
	
	@Insert("INSERT INTO error VALUES "
			+ "(#{id}, #{manager}, sysdate ,#{visual_in}, "
			+ "#{mechanic}, #{durabilit})")	
	int insertError(Error ins);

	@Delete("DELETE error WHERE id = #{id}")
	int deleteError(@Param("id") int id);
	
	@Update("UPDATE ERROR "
			+ "SET manager = #{manager},"
			+ "INSPECTION = sysdate ,"
			+ "VISUAL_IN = #{visual_in},"
			+ "MECHANIC = #{mechanic}, "
			+ "DURABILIT = #{durabilit} "
			+ "WHERE id = #{id}")
	int updateError(Error upt);	
	
}
