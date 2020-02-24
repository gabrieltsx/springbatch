package com.gahlls.example.config;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gahlls.example.model.User;

public class UserRowMapper implements RowMapper<User> {

	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();

		user.setId(rs.getLong("id"));
		user.setName(rs.getString("name"));
		user.setLastname(rs.getString("lastname"));
		return user;
	}
}
