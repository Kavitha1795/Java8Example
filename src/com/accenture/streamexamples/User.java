package com.accenture.streamexamples;

public class User {

	private int userid;
	
	private String userName;

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public User(int userid, String userName) {
		super();
		this.userid = userid;
		this.userName = userName;
	}
	
	@Override
	public String toString() {
		return "[ User Id :"+userid+", UserName :"+userName+" ]";
	}
	
	
}
