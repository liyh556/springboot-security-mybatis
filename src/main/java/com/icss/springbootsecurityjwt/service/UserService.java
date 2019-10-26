package com.icss.springbootsecurityjwt.service;


import com.github.pagehelper.PageInfo;
import com.icss.springbootsecurityjwt.model.SysUser;


import java.util.List;
import java.util.Map;

/**
 * 用户
 */
public interface UserService {

	/**
	 * 列表用户
	 * @param user
	 * @return
	 */
	PageInfo page(SysUser user);

	/**
	 * 通过 id 查询用户
	 *
	 * @param id
	 * @return
	 */
	SysUser findById(Long id);

	/**
	 * 通过 用户名 查询用户
	 *
	 * @param
	 * @return
	 */
	SysUser findByUserName(String userName);



	SysUser findByUserNameOrPhone(String username);
}
