package com.web.home.board.model;

import java.sql.Date;

public class boardVO {
	private int board_id;
	private String title;
	private String content;
	private Date b_date;
	private int b_good;
	private int b_count;
	private String userid;
	public int getBoard_id() {
		return board_id;
	}
	public String getTitle() {
		return title;
	}
	public String getContent() {
		return content;
	}
	public Date getB_date() {
		return b_date;
	}
	public int getB_good() {
		return b_good;
	}
	public int getB_count() {
		return b_count;
	}
	public String getUserid() {
		return userid;
	}
	public void setBoard_id(int board_id) {
		this.board_id = board_id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public void setB_date(Date b_date) {
		this.b_date = b_date;
	}
	public void setB_good(int b_good) {
		this.b_good = b_good;
	}
	public void setB_count(int b_count) {
		this.b_count = b_count;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "boardVO [board_id=" + board_id + ", title=" + title + ", content=" + content + ", b_date=" + b_date
				+ ", b_good=" + b_good + ", b_count=" + b_count + ", userid=" + userid + "]";
	}
	
	
}
