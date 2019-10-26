package com.icss.springbootsecurityjwt.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.icss.springbootsecurityjwt.mapper.UserMapper;
import com.icss.springbootsecurityjwt.model.SysUser;
import com.icss.springbootsecurityjwt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper ;

	@Override
	public PageInfo page(SysUser user) {
		PageHelper.startPage(user.getPageNum(),user.getPageSize());
		List<SysUser> list = userMapper.select(user);
		PageInfo pageInfo = new PageInfo(list);
		return pageInfo;
	}

	@Override
	public SysUser findById(Long id) {
		return null;
	}

	@Override
	public SysUser findByUserName(String userName) {
		return userMapper.selectOne(new SysUser(userName));
	}

	@Override
	public SysUser findByUserNameOrPhone(String userName) {


		return userMapper.findByUserNameOrPhone(userName);
	}

}
