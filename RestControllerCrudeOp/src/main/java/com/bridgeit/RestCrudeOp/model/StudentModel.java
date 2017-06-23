package com.bridgeit.RestCrudeOp.model;

public class StudentModel 
{
	private int s_id;
	private String sname;
	private String address;
	private String mobile;
	
	public StudentModel(){
		
	}
	
	public StudentModel(int s_id, String sname, String address, String mobile) 
	{
		
		this.s_id = s_id;
		this.sname = sname;
		this.address = address;
		this.mobile = mobile;
	}

	
	public void setS_id(int s_id) {
		this.s_id = s_id;
	}

	public int getS_id() {
		return s_id;
	}

	public String getSname() {
		return sname;
	}

	public String getAddress() {
		return address;
	}

	public String getMobile() {
		return mobile;
	}

	@Override
	public String toString() {
		return "StudentModel [s_id=" + s_id + ", sname=" + sname + ", address=" + address + ", mobile=" + mobile + "]";
	}
	
	
	
	
}
