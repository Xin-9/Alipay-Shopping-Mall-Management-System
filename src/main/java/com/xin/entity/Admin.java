package com.xin.entity;

public class Admin {
	private String adminId;
	private String adminname;
	private String adminpwd;
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin(String adminId, String adminname, String adminpwd) {
		super();
		this.adminId = adminId;
		this.adminname = adminname;
		this.adminpwd = adminpwd;
	}
	public String getAdminId() {
		return adminId;
	}
	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}
	public String getAdminname() {
		return adminname;
	}
	public void setAdminname(String adminname) {
		this.adminname = adminname;
	}
	public String getAdminpwd() {
		return adminpwd;
	}
	public void setAdminpwd(String adminpwd) {
		this.adminpwd = adminpwd;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminname=" + adminname + ", adminpwd=" + adminpwd + "]";
	}
	
	
}
