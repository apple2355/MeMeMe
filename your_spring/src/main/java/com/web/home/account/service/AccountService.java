package com.web.home.account.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.home.account.model.AccountDAO;
import com.web.home.account.model.AccountDTO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDTO dto;
	
	@Autowired
	private AccountDAO dao;

	public AccountDTO login(String userid, String pw) {
		
		dto.setUserid(userid);
		dto.setPw(pw);
		
		AccountDTO account = dao.selectAccount(dto);
		
		if(account != null) {
			return account;
		}
		return null;
	}

}
