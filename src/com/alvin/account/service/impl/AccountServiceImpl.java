package com.alvin.account.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alvin.account.service.AccountService;
import com.alvin.mybatis.dao.RoleMapper;
import com.alvin.mybatis.dao.TUserMapper;
import com.alvin.mybatis.dao.UserRoleMapper;
import com.alvin.mybatis.domain.TUser;
import com.alvin.mybatis.domain.UserRole;

@Service
public class AccountServiceImpl implements AccountService{

	private TUserMapper tuserMapper;
	private RoleMapper roleMapper;
	private UserRoleMapper userRoleMapper;
	
	@Override
	public TUser getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return tuserMapper.selectByUserName(username);
	}

	@Override
	public List<String> getPermissionsByUserName(String username) {
		// TODO Auto-generated method stub
		TUser user=tuserMapper.selectByUserName(username);
		List<UserRole> urList= userRoleMapper.selectByUserId(user.getId());
		List<String> list = new ArrayList<String>();  
		
		
		
		return null;
	}

}
