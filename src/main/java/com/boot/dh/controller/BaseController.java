/**  
 * Project Name:blog  
 * File Name:BaseController.java  
 * Package Name:com.blog.controller  
 * Date:2016-8-11下午3:57:54  
 * Copyright (c) 2016, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package com.boot.dh.controller;  

import org.springframework.beans.factory.annotation.Autowired;

import com.boot.dh.service.BlogService;
import com.boot.dh.service.BlogTypeService;
import com.boot.dh.service.LinkService;

/**  
 * ClassName:BaseController <br/>  
 * Function: controller基类. <br/>  
 * Date:     2016-8-11 下午3:57:54 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
public class BaseController {
	@Autowired
	protected LinkService linkService;
	
	@Autowired
	protected BlogTypeService blogTypeService;
	
	@Autowired
	protected BlogService blogService;
	
}
  
