package com.icss.springbootsecurityjwt.mapper;

import com.icss.springbootsecurityjwt.model.SysRole;
import com.icss.springbootsecurityjwt.model.SysUser;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;


import java.util.List;
import java.util.Map;

/**
 * 用户
 */
@Repository
public interface UserMapper extends Mapper<SysUser> {

    /**
     * 通过账号或手机号查找
     * @param userName
     * @return
     */
    SysUser findByUserNameOrPhone(@Param("userName") String userName);
}
