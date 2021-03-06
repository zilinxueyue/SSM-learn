package com.alvin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvin.mybatis.dao.MyMapper;
import com.alvin.mybatis.dao.UserMapper;
import com.alvin.mybatis.domain.MyEntity;
import com.alvin.mybatis.domain.User;
import com.alvin.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private MyMapper myMapper;

	@Override
	public int deleteByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(User record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public User selectByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(User record) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKeySelective(record);
		return 0;
	}

	@Override
	public int updateByPrimaryKey(User record) {
		// TODO Auto-generated method stub
		userMapper.updateByPrimaryKey(record);
		return 0;
	}

	@Override
	public User selectByUserName(String name) {
		// TODO Auto-generated method stub
		return userMapper.selectByUserName(name);
	}

	@Override
	public MyEntity selectMyentityByPrimaryKey(Long id) {
		// TODO Auto-generated method stub
		return myMapper.selectMyentityByPrimaryKey(id);
	}
	
	
}
