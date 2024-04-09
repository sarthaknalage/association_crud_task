package com.sarthak.task.crud.association.crudService;

import com.sarthak.task.crud.association.entity.User;

public interface InterServiceUserCrud {
	
	public User saveUserWithDetails(User user);
	
	public User findUserById(Integer id);
	
	public User updateUserAndDetails(User user);
	
	public Boolean deleteUser(Integer id);
}
