/**  
 * Project Name:blog  
 * File Name:AdminController.java  
 * Package Name:com.blog.controller  
 * Date:2016年9月14日下午1:15:17  
 * Copyright (c) 2016, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package com.boot.dh.controller.supervisor;  

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.dh.controller.BaseController;

/**  
 * ClassName:AdminController <br/>  
 * Function: 后台管理控制器. <br/>  
 * Date:     2016年9月14日 下午1:15:17 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
@Controller
@RequestMapping("/supervisor")
public class IndexController extends BaseController{
	Logger logger = Logger.getLogger(IndexController.class);

	
}
  
