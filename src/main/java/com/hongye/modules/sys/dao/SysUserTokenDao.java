/**
 * Copyright (c) 2016-2019 鸿业众创 All rights reserved.
 *
 * https://www.zyqiu.com
 *
 * 版权所有，侵权必究！
 */

package com.hongye.modules.sys.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hongye.modules.sys.entity.SysUserTokenEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统用户Token
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysUserTokenDao extends BaseMapper<SysUserTokenEntity> {

    SysUserTokenEntity queryByToken(String token);
	
}
