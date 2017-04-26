/**  
 * Project Name:blog  
 * File Name:LinkDaoImpl.java  
 * Package Name:com.boot.dh.dao.impl  
 * Date:2017年3月28日下午5:23:24  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.dh.dao.custom.LinkDaoCustom;
import com.boot.dh.entity.Link;

/**
 * * ClassName: LinkDaoImpl <br/>  
 * Function: 自定义dao方法  
 * date: 2017年4月1日 上午11:56:21 <br/>  
 *  
 * @author daihui  
 * @version   
 * @since JDK 1.7
 */

@Repository("LinkDaoCustom") 
public class LinkDaoImpl implements LinkDaoCustom{
     
	@Autowired
	private EntityManager em;
	
	/**
	 * 根据id批量删除.  
	 * @see com.boot.dh.dao.custom.LinkDaoCustom#deleteLinks(java.lang.String[])
	 */
	@Override
	public int deleteLinks(String[] ids) {
		
		String sql = "delete from Link l where l.id in ( ";
		for (String str:ids) {
			sql=String.format("%s%s,",sql,str);
        }
		sql=sql.substring(0, sql.length()-1)+" )";
		Query query = em.createQuery(sql);
		
		return query.executeUpdate();
		
	}

	@Override
	public int saveOrUpdate(Link link) {
		/*String sql = "";
		if(link.getId()==0){
			sql="insert into link(name,url,is_use) values()";
		}else{
		    sql="";
		}

        Query query = em.createQuery(sql);*/
		
		return 1;
	}

}
