package com.web.mes_tire.Process.Dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.web.mes_tire.Process.vo.Instruction;

@Mapper
public interface InsDao {

	
	@Select("select * from PROCESS_INSTRUCTION")
	List<Instruction> getBoardList();
	

	@Insert("insert into process_instruction values(#{id},#{process_name}, #{instruction},"
			+ " #{safety_rules}, #{created_by})")
	int insertBoard(Instruction ins);
	
	
	
	@Update("update process_instruction"
			+ " set process_name = #{process_name},"
			+ "		instruction = #{instruction},"
			+ "		safety_rules = #{safety_rules},"
			+ "		created_by = #{created_by}"
			+ "		where id = #{id}")
	int updateBoard(Instruction upt);
	
	
	@Select("select * from process_instruction where id = #{id}")
	Instruction idSerach(@Param("id") int id);
	
	
	
	
	@Delete("delete from process_instruction where id = #{id}")
	int deleteBoard(@Param("id") int id);
	
	
	
	
	
	
}
