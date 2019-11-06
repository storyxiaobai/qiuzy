/**
 * Copyright (c) 2016-2019 鸿业众创 All rights reserved.
 *
 * https://www.zyqiu.com
 *
 * 版权所有，侵权必究！
 */

package com.hongye.common.utils;

import java.util.HashMap;


/**
 * Map工具类
 *
 * @author Mark sunlightcs@gmail.com
 */
public class MapUtils extends HashMap<String, Object> {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    public MapUtils put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
