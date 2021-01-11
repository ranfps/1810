package com.bw.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.bw.entity.User;

public interface UserMapper {
	@Select("SELECT * FROM user")
	List<User> findlist();
	
}
