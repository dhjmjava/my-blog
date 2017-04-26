/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:BlogCache.java  
 * Package Name:com.boot.dh.cache  
 * Date:2017年3月22日下午3:37:41  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.cache;

import java.util.List;

import com.boot.dh.entity.Blog;
import com.boot.dh.service.BlogService;
import com.boot.dh.util.SpringUtil;

/**
 * @author Administrator
 *
 */
public class BlogCache {
	
	private static BlogService blogService = SpringUtil.getBean(BlogService.class);
	//加载数据到缓存
	public static void setUserToCache(){
		List<Blog> list = blogService.fingAll();
	}
	
	//刷新缓存
	public static void reload(){
		
	}
	

}
