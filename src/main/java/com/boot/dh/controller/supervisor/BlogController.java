/**  
 * Project Name:blog  
 * File Name:BlogController.java  
 * Package Name:com.blog.controller  
 * Date:2016-8-12下午2:39:48  
 * Copyright (c) 2016, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package com.boot.dh.controller.supervisor;  


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dh.controller.BaseController;
import com.boot.dh.entity.Blog;

/**  
 * ClassName:BlogController <br/>  
 * Function: 博客控制器. <br/>  
 * Date:     2016-8-12 下午2:39:48 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
@Controller
@RequestMapping("/supervisor/blog")
public class BlogController extends BaseController{
	
	@RequestMapping("/saveOrUpdate")
	@ResponseBody
	public int saveOrUpdate(Blog blog){
		int result = blogService.saveOrUpdate(blog);
		return result;
	}
	
	
}
  
