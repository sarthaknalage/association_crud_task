package com.sarthak.task.crud.association.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="user_details_id")
	private Integer userDetailsId;
	
	@Column(name="user_address")
	private String userAddress;
	
	public UserDetails() {
		
	}

	public UserDetails(String userAddress) {
		super();
		this.userAddress = userAddress;
	}

	public Integer getUserDetailsId() {
		return userDetailsId;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "UserDetails [userDetailsId=" + userDetailsId + ", userAddress=" + userAddress + "]";
	}
	
	
}
