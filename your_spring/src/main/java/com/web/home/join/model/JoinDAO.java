package com.web.home.join.model;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class JoinDAO {

	@Autowired
	private SqlSession sess;
	
	public int insertJoin(JoinVO vo) {
		return this.sess.insert("JoinMapper.insertJoin", vo);
	}
	
	public int selectIdCheck(String userid) {
		int result = this.sess.selectOne("JoinMapper.selectJoin", userid);
		return result;
	}

}
