package com.alvin.bussiness.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alvin.bussiness.service.UserLoginService;
import com.alvin.mybatis.dao.UserMapper;
import com.alvin.mybatis.domain.User;

@Service
public class UserloginServiceImpl implements UserLoginService{
   
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public boolean checkUser(User user) {
		// TODO Auto-generated method stub
		if(userMapper.selectByPrimaryKey(user.getId()) != null){
			return true;
		}
		
		return false;
	}

}
