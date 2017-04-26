/**  
 * Project Name:blog  
 * File Name:BlogService.java  
 * Package Name:com.boot.dh.service  
 * Date:2017年4月1日下午5:05:40  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.service;

import java.util.List;

import com.boot.dh.entity.Blog;

/**
 * @author Administrator
 *
 */
public interface BlogService {
	
	public List<Blog> fingAll();
	
	public Blog findBlogById(long id);
	
	public int deleteById(long id);
	
	public int saveOrUpdate(Blog blog);

}
