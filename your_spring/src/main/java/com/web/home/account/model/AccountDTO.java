package com.web.home.account.model;

import java.sql.Date;

import org.springframework.stereotype.Component;

@Component
public class AccountDTO {

	private int acc_id;
	private String userid;
	private String pw;
	private Date joindate;
	public int getAcc_id() {
		return acc_id;
	}
	public String getUserid() {
		return userid;
	}
	public String getPw() {
		return pw;
	}
	public Date getJoindate() {
		return joindate;
	}
	public void setAcc_id(int acc_id) {
		this.acc_id = acc_id;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}
	@Override
	public String toString() {
		return "AccountDTO [acc_id=" + acc_id + ", userid=" + userid + ", pw=" + pw + ", joindate=" + joindate + "]";
	}
	
	
}
