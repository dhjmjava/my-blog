/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:LinkService.java  
 * Package Name:com.boot.dh.service  
 * Date:2017年3月22日下午7:22:11  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.boot.dh.entity.Link;

/**
 * @author Administrator
 *
 */
public interface LinkService{
	
	public List<Link> findAll();
	
	public Link saveLink(Link link);
	
	public int deleteLinks(String[] ids);
	
	public Link findById(long id);
	
	public Link saveOrUpdata(Link link);
	
	public Page<Link> findLinkByPage(Pageable pageable);

}
