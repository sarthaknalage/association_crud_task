package com.sarthak.task.crud.association.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// Here developing the rest end points

import com.sarthak.task.crud.association.crudService.InterServiceUserCrud;
import com.sarthak.task.crud.association.entity.MappingModel;
import com.sarthak.task.crud.association.entity.User;
import com.sarthak.task.crud.association.entity.UserDetails;
@RestController
@RequestMapping("/user")
public class UserCrudRestContoller {
	
//	DI of service layer so that we can call its functionality
	@Autowired
	private InterServiceUserCrud serviceCrud;
	
//	developing the end point for persist the user
	@PostMapping(value = "/save", consumes = "application/json",produces = "application/json")
	public ResponseEntity<User> saveUserWithDetails(@RequestBody MappingModel model){
//		breaking such that creation of User and UserDetails are done from that
		User user=new User();
		user.setUserName(model.getuName());
		user.setUserAge(model.getuAge());
		UserDetails uDetails=new UserDetails(model.getuAddress());
		user.setUserDetail(uDetails);
//		Now time to save the entity
		User savedEntity=this.serviceCrud.saveUserWithDetails(user);
		System.out.println(savedEntity);
		return ResponseEntity.status(HttpStatus.OK).body(savedEntity);
	}
}
