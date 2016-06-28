package com.alvin.account.service;

import java.util.List;

import com.alvin.mybatis.domain.TUser;

public interface AccountService {
	
	public TUser getUserByUserName(String username);
	
	 public List<String> getPermissionsByUserName(String username);
}
