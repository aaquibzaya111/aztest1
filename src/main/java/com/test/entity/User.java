package com.test.entity;

import javax.persistence.*;

@Entity
@Table(name="lolo")
public class User {
	@Id
	long id;
	@Column(name="first_Name", length=250 ,nullable=false)
	String firtName;
	@Column(name="last_Name" , length=250, nullable=false)
	String lastName;
	@Column(name="mobile", unique=true, nullable=false)
	long mobile;
	@Column(name="email", unique=true, nullable=false)
	String email;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirtName() {
		return firtName;
	}
	public void setFirtName(String firtName) {
		this.firtName = firtName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
