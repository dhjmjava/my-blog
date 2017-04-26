/**  
 * Project Name:blog  
 * File Name:Blogger.java  
 * Package Name:com.boot.dh.dao  
 * Date:2017年4月1日下午4:41:57  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.dh.entity.Blogger;

/**
 * @author Administrator
 *
 */
public interface BloggerDao extends JpaRepository<Blogger, Long>,BaseDao<Blogger>{

}
