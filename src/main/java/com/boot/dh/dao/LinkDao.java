/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:LinkDao.java  
 * Package Name:com.boot.dh.dao  
 * Date:2017年3月22日下午7:19:07  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.boot.dh.dao.custom.LinkDaoCustom;
import com.boot.dh.entity.Link;

/**
 * @author Administrator
 *
 */
public interface LinkDao extends PagingAndSortingRepository<Link, String> ,LinkDaoCustom,BaseDao<Link>{

	Page<Link> findByUrl(Pageable pageable);
	
}
