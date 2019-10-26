/**
 * 
 */
package com.icss.springbootsecurityjwt.security.service;

import com.icss.springbootsecurityjwt.model.SysUser;
import com.icss.springbootsecurityjwt.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

/**
 */
@Component
public class LoginUserDetailsService implements UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserService userService;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.security.core.userdetails.UserDetailsService#
	 * loadUserByUsername(java.lang.String)
	 */
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		logger.info("登录用户名:" + username);
		SysUser sysUser = userService.findByUserNameOrPhone(username);
		if(sysUser==null){
			throw  new UsernameNotFoundException("用户不存在");
		}
		// 根据用户名查找用户信息
		//根据查找到的用户信息判断用户是否被冻结
		//String password = passwordEncoder.encode(sysUser.getPassword());
		logger.info("数据库密码是:"+sysUser.getPassword());
		return new User(username, sysUser.getPassword(),
				true, true, true, true,
				AuthorityUtils.commaSeparatedStringToAuthorityList("admin,users"));
	}



}
