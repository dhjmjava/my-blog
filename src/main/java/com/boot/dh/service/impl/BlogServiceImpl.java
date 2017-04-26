/**  
 * Project Name:blog  
 * File Name:BlogServiceImpl.java  
 * Package Name:com.boot.dh.service.impl  
 * Date:2017年4月1日下午5:05:55  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dh.dao.BlogDao;
import com.boot.dh.entity.Blog;
import com.boot.dh.service.BlogService;

/**
 * @author Administrator
 *
 */
@Service
public class BlogServiceImpl implements BlogService{
    
	@Autowired
	private BlogDao blogDao;
	
	/**  
	 * 查询所有博客.  
	 * @see com.boot.dh.service.BlogService#fingAll()  
	 */
	 
	@Override
	public List<Blog> fingAll() {
		  
		return blogDao.findAll();
		
	}

	/**  
	 * 根据id查询.  
	 * @see com.boot.dh.service.BlogService#findBlogById(long)  
	 */
	 
	@Override
	public Blog findBlogById(long id) {
		  
		return blogDao.findById(id);
		
	}

	/**  
	 * TODO 简单描述该方法的实现功能（可选）.  
	 * @see com.boot.dh.service.BlogService#deleteById(long)  
	 */
	 
	@Override
	public int deleteById(long id) {
		  
		// TODO Auto-generated method stub  
		return 0;
		
	}

	/**  
	 * TODO 简单描述该方法的实现功能（可选）.  
	 * @see com.boot.dh.service.BlogService#saveOrUpdate(com.boot.dh.entity.Blog)  
	 */
	 
	@Override
	public int saveOrUpdate(Blog blog) {
		
		return 0;
		
	}

}
