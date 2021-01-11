package com.bw.entity;

public class User {
	private Integer uid;
	private String username;
	private String pwd;
	private Integer sex;
	private String brithday;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String username, String pwd, Integer sex, String brithday) {
		super();
		this.uid = uid;
		this.username = username;
		this.pwd = pwd;
		this.sex = sex;
		this.brithday = brithday;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	public String getBrithday() {
		return brithday;
	}
	public void setBrithday(String brithday) {
		this.brithday = brithday;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", pwd=" + pwd + ", sex=" + sex + ", brithday="
				+ brithday + "]";
	}
}