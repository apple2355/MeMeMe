package com.web.home.join.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.home.join.model.JoinDAO;
import com.web.home.join.model.JoinVO;

@Service
public class JoinService {

	@Autowired
	private JoinDAO dao;
	
	public int insertJoin(JoinVO vo) {
		int join = dao.insertJoin(vo);
		return join;
	}
	
	public int selectIdCheck(String userid) {
		int idCheck = dao.selectIdCheck(userid);
		return idCheck;
	}

}
