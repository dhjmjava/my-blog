/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:LinkDao.java  
 * Package Name:com.boot.dh.dao  
 * Date:2017年3月22日下午7:19:07  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.dao.custom;

import org.springframework.stereotype.Repository;

import com.boot.dh.entity.Link;


/**
 * * ClassName: LinkDaoCustom <br/>  
 * Function:定制个人的增删改查方法. <br/>  
 * date: 2017年4月1日 下午12:53:59 <br/>  
 *  
 * @author daihui  
 * @version   
 * @since JDK 1.7
 */
@Repository
public interface LinkDaoCustom{
	
	/**
	 * 
	 * deleteLinks:根据id批量 删除. <br/>   
	 *  
	 * @author daihui  
	 * @param ids
	 * @return  
	 * @since JDK 1.7
	 */
	int deleteLinks(String[] ids);
	
	int saveOrUpdate(Link link);
}
