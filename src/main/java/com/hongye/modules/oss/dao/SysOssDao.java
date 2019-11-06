/**
 * Copyright (c) 2016-2019 鸿业众创 All rights reserved.
 *
 * https://www.zyqiu.com
 *
 * 版权所有，侵权必究！
 */

package com.hongye.modules.oss.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hongye.modules.oss.entity.SysOssEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 *
 * @author Mark sunlightcs@gmail.com
 */
@Mapper
public interface SysOssDao extends BaseMapper<SysOssEntity> {
	
}
