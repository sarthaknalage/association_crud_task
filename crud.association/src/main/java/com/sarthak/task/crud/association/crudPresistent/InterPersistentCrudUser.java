package com.sarthak.task.crud.association.crudPresistent;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sarthak.task.crud.association.entity.User;

@Repository(value = "repositoryCrud")
public interface InterPersistentCrudUser extends JpaRepository<User,Integer> {

}
