/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:BlogTypeService.java  
 * Package Name:com.boot.dh.service  
 * Date:2017年3月24日下午12:49:17  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.service;

import java.util.List;

import com.boot.dh.entity.BlogType;

/**
 * @author Administrator
 *
 */
public interface BlogTypeService {

	public List<BlogType> getAllType();
	
	public BlogType findBlogTypeById(long id);
	
	public int deleteById(long id);
	
}
