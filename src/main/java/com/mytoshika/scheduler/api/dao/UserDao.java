package com.mytoshika.scheduler.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mytoshika.scheduler.api.model.User;

public interface UserDao extends JpaRepository<User, Integer>{

}
