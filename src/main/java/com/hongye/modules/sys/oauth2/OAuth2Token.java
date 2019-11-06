/**
 * Copyright (c) 2016-2019 鸿业众创 All rights reserved.
 *
 * https://www.zyqiu.com
 *
 * 版权所有，侵权必究！
 */

package com.hongye.modules.sys.oauth2;


import org.apache.shiro.authc.AuthenticationToken;

/**
 * token
 *
 * @author Mark sunlightcs@gmail.com
 */
public class OAuth2Token implements AuthenticationToken {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String token;

    public OAuth2Token(String token){
        this.token = token;
    }

    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public Object getCredentials() {
        return token;
    }
}
