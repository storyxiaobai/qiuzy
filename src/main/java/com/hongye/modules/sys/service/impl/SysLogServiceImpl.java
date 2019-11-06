/**
 * Copyright (c) 2016-2019 鸿业众创 All rights reserved.
 *
 * https://www.zyqiu.com
 *
 * 版权所有，侵权必究！
 */

package com.hongye.modules.sys.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hongye.common.utils.PageUtils;
import com.hongye.common.utils.Query;
import com.hongye.modules.sys.dao.SysLogDao;
import com.hongye.modules.sys.entity.SysLogEntity;
import com.hongye.modules.sys.service.SysLogService;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("sysLogService")
public class SysLogServiceImpl extends ServiceImpl<SysLogDao, SysLogEntity> implements SysLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        String key = (String)params.get("key");

        IPage<SysLogEntity> page = this.page(
            new Query<SysLogEntity>().getPage(params),
            new QueryWrapper<SysLogEntity>().like(StringUtils.isNotBlank(key),"username", key)
        );

        return new PageUtils(page);
    }
}
