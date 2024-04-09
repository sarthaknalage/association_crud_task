package com.sarthak.task.crud.association.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_id")
	private Integer userID;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_age")
	private Integer userAge;
	
	@OneToOne(targetEntity = UserDetails.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name="fk_user_detail")
	private UserDetails userDetail;
	
	public User() {
		
	}

	public User(String userName, Integer userAge) {
		super();
		this.userName = userName;
		this.userAge = userAge;
	}

	public User(String userName, Integer userAge, UserDetails userDetail) {
		super();
		this.userName = userName;
		this.userAge = userAge;
		this.userDetail = userDetail;
	}

	public Integer getUserID() {
		return userID;
	}


	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public UserDetails getUserDetail() {
		return userDetail;
	}

	public void setUserDetail(UserDetails userDetail) {
		this.userDetail = userDetail;
	}

	@Override
	public String toString() {
		return "User [userID=" + userID + ", userName=" + userName + ", userAge=" + userAge + ", userDetail="
				+ userDetail + "]";
	}
	
	
}
