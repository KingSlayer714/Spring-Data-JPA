package com.sohamglobal.springdatajpa.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "members")
public class Member {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int memberid;
	
	private String name;
	private String gender;
	private int age;
	private String mobile;
	
	@Column(name= "join_year")
	private int joinyear;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getMemberid() {
		return memberid;
	}

	public void setMemberid(int memberid) {
		this.memberid = memberid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public int getJoinyear() {
		return joinyear;
	}

	public void setJoinyear(int joinyear) {
		this.joinyear = joinyear;
	}

	@Override
	public String toString() {
		return "Member [memberid=" + memberid + ", name=" + name + ", gender=" + gender + ", age=" + age + ", mobile="
				+ mobile + ", joinyear=" + joinyear + "]";
	}

	

}
