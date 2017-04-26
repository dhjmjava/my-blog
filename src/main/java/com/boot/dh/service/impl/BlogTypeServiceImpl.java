/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:BlogTypeServiceImpl.java  
 * Package Name:com.boot.dh.service.impl  
 * Date:2017年3月24日下午12:50:00  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.service.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dh.dao.BlogTypeDao;
import com.boot.dh.entity.BlogType;
import com.boot.dh.service.BlogTypeService;

/**
 * @author Administrator
 *
 */
@Service
public class BlogTypeServiceImpl implements BlogTypeService{

	@Autowired
	private EntityManager em;
	
	@Autowired
	private BlogTypeDao blogTypeDao;
	 
	/**
	 * 
	 * 获取所有类型.  
	 * @see com.boot.dh.service.BlogTypeService#getAllType()
	 */
	@Override
	public List<BlogType> getAllType() {
		  
		return blogTypeDao.findAll();
		
	}

	/**  
	 * 根据id查找.  
	 * @see com.boot.dh.service.BlogTypeService#findBlogTypeById(long)  
	 */
	@Override
	public BlogType findBlogTypeById(long id) {
		  
		return null;
		
	}

	/**  
	 * 根据id删除类型.  
	 * @see com.boot.dh.service.BlogTypeService#deleteById(long)  
	 */
	 
	@Override
	public int deleteById(long id) {
		  
		return 0;
		
	}

}
