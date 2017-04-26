/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:BlogTypeDao.java  
 * Package Name:com.boot.dh.dao  
 * Date:2017年3月24日下午12:45:46  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.boot.dh.entity.BlogType;


public interface BlogTypeDao extends JpaRepository<BlogType,Long>,BaseDao<BlogType>{
	
	@Modifying
	@Query(value="delete from blogtype where id=?1",nativeQuery=true)
	public int deleteById(long id);
	

}
