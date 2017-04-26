/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:LinkServiceImpl.java  
 * Package Name:com.boot.dh.service.impl  
 * Date:2017年3月22日下午7:22:44  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.boot.dh.entity.Link;
import com.boot.dh.service.BaseService;
import com.boot.dh.service.LinkService;

/**
 * @author Administrator
 *
 */
@Service
@Transactional
public class LinkServiceImpl extends BaseService implements LinkService{

	/**
	 * 
	 * 查找所有link.  
	 * @see com.boot.dh.service.LinkService#findAll()
	 */
	@Override
	public List<Link> findAll() {
		List<Link> findAll = linkDao.findAll();
		 System.out.println(findAll.size()); 
		return linkDao.findAll();
		
	}

	/**
	 * 
	 * 保存link.  
	 * @see com.boot.dh.service.LinkService#saveLink(com.boot.dh.entity.Link)
	 */
	@Override
	public Link saveLink(Link link) {
		  
		return linkDao.save(link);
		
	}

	/**  
	 * 批量删除.  
	 * @see com.boot.dh.service.LinkService#deleteLinks(java.lang.String[])  
	 */
	 
	@Override
	public int deleteLinks(String[] ids) {
		
		return linkDao.deleteLinks(ids);
		
	}

	@Override
	public Link findById(long id) {
		
		return linkDao.findById(id);
	}

	@Override
	public Link saveOrUpdata(Link link) {
		return linkDao.save(link);
	}

	@Override
	public Page<Link> findLinkByPage(Pageable pageable) {
		  
		return linkDao.findByUrl(pageable);
		
	}

}
