package com.sarthak.task.crud.association.crudService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sarthak.task.crud.association.crudPresistent.InterPersistentCrudUser;
import com.sarthak.task.crud.association.entity.User;

@Service(value = "serviceCrud")
public class ImplServiceUserCrud implements InterServiceUserCrud {
	
	// DI of repository impl class
	@Autowired
	InterPersistentCrudUser repositoryCrud;
	
	
	@Override
	public User saveUserWithDetails(User user) {
		if(user!=null) {
			User savedEntity=this.repositoryCrud.save(user);
			return savedEntity;
		}
//		Here need to throw Exception I by passed with returning the null
		return null;
	}

	@Override
	public User findUserById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User updateUserAndDetails(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
