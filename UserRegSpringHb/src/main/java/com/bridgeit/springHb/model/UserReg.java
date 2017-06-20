package com.bridgeit.springHb.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="UserReg")
public class UserReg implements Serializable
{
	@Id
	@Column(name="u_id")
	@GenericGenerator(name="uid",strategy="increment")
	@GeneratedValue(generator="uid")
	private int id;
	
	@Column(nullable=false)
	@NotEmpty(message="Please Enter Valid Name")
	private String name;
	
	@Column(nullable=false,unique=true)
	@NotEmpty(message="Please Enter Valid Email")
	@Email(message="Please Enter Valid Email")
	private String email;
	
	@Column(nullable=false)
	@NotEmpty(message="Please Enter Password")
	private String password;
	
	public UserReg()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserReg [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
