package com.boot.dh.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.dh.dao.BlogDao;
import com.boot.dh.dao.BlogTypeDao;
import com.boot.dh.dao.BloggerDao;
import com.boot.dh.dao.LinkDao;

public class BaseService {
	
	@PersistenceContext
	protected EntityManager em;
	
	@Autowired
	protected BlogDao blogDao;
	
	@Autowired
	protected LinkDao linkDao;
	
	@Autowired
	protected BlogTypeDao blogTypeDao;
	
	@Autowired
	protected BloggerDao bloggerDao;
	
}
