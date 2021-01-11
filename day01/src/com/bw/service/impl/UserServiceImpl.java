package com.bw.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.bw.dao.UserMapper;
import com.bw.entity.User;
import com.bw.service.UserService;
import com.bw.util.MybatisUtil;


public class UserServiceImpl implements UserService {
	@Override
	public List<User> findlist() {
		SqlSession session = MybatisUtil.getSession();
		return session.getMapper(UserMapper.class).findlist();
	}

}
