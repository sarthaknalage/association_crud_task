package com.sarthak.task.crud.association.entity;

// This model purpose is only to map the data coming from consumer side i.e frontend
// to make proper division so that we can map it as into User and UserDetails
public class MappingModel {
	
	private String uName;
	
	private Integer uAge;
	
	private String uAddress;
	
	public MappingModel() {
		
	}

	public String getuName() {
		return uName;
	}

	public Integer getuAge() {
		return uAge;
	}

	public String getuAddress() {
		return uAddress;
	}

}
