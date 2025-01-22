package com.web.mes_tire.Process.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.mes_tire.Process.Dao.LogDao;
import com.web.mes_tire.Process.vo.Exception_log;

@Service

public class LogService {

	
	@Autowired(required = false)
	private LogDao dao;
	
	public List<Exception_log> getList3(){
		return dao.getList3();
	}
	
	
	
	
	
}
