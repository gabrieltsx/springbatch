package com.gahlls.example.config;

import org.springframework.batch.item.ItemProcessor;

import com.gahlls.example.model.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class UserItemProcessor implements ItemProcessor<User, User> {

	@Override
	public User process(User item) throws Exception {
		
		log.info("ID: " + item.getId());
		log.info("NAME: ".concat(item.getName()));
		log.info("LASTNAME: ".concat(item.getLastname()));
		
		return new User(item.getId(), item.getName().toUpperCase(), item.getLastname().toUpperCase());
	}
}
