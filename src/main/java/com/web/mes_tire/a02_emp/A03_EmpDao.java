package com.web.mes_tire.a02_emp;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface A03_EmpDao {
	@Select("select * from emp01 "
			+ "where ename like #{ename} "
			+ "and job like #{job} "
			+ "order by empno")
	List<Emp> getEmpList(Emp sch);
}
