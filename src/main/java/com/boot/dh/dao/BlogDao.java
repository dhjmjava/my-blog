/**  
 * Project Name:blog  
 * File Name:BlogDao.java  
 * Package Name:com.boot.dh.dao  
 * Date:2017年4月1日下午4:40:39  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.dao;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.boot.dh.dao.custom.BlogDaoCustom;
import com.boot.dh.entity.Blog;

/**
 * @author Administrator
 *
 */
public interface BlogDao extends PagingAndSortingRepository<Blog, String> ,BlogDaoCustom,BaseDao<Blog>{
	
	@Modifying
	@Query(value="delete from blog where id=?1",nativeQuery=true)
	public int deleteBlogById(long id);
	
}
