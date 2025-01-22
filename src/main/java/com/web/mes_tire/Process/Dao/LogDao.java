package com.web.mes_tire.Process.Dao;

import java.util.List;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.web.mes_tire.Process.vo.Exception_log;

@Mapper
public interface LogDao {

	@Select("select * from exception_log")
	List<Exception_log> getList3();
	
	
}
