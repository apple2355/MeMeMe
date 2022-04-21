package com.web.home.account.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDAO {
	
	@Autowired
	private SqlSession sess;

	public AccountDTO selectAccount(AccountDTO dto) {
		return this.sess.selectOne("AccountMapper.selectAccount", dto);
	}

}
