/**  
 * Project Name:blog  
 * File Name:LinkController.java  
 * Package Name:com.blog.controller  
 * Date:2016年10月3日下午11:32:33  
 * Copyright (c) 2016, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package com.boot.dh.controller.supervisor;  

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dh.controller.BaseController;
import com.boot.dh.entity.Link;

/**  
 * ClassName:LinkController <br/>  
 * Function: link控制器. <br/>  
 * Date:     2016年10月3日 下午11:32:33 <br/>  
 * @author   Administrator  
 * @version    
 * @since    JDK 1.6  
 * @see        
 */
@Controller
@RequestMapping("supervisor")
public class LinkController extends BaseController{
	
	@RequestMapping("/link.html")
	public String link(Model model){
		return "link";
	}
	
	@RequestMapping("/deleteLink")
	@ResponseBody
	public int deleteLinks(@RequestParam("ids[]") String[] ids,HttpServletRequest request){
		int result = 0;
		if(ids!=null&&ids.length>0){
			result = linkService.deleteLinks(ids);
		}
		return result;
	}
	
	@RequestMapping("/saveLink")
	@ResponseBody
	public String saveLink(HttpServletRequest request){
		String name=request.getParameter("name");
		String url = request.getParameter("url");
		Link link = new Link();
		link.setName(name);
		link.setUrl(url);
		link.setIsUse(true);
		try{
			linkService.saveOrUpdata(link);
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		return "success";
	}
	
	@RequestMapping("/getAllLink")
	@ResponseBody
	public List<Link> getAllLink(){
		return linkService.findAll();
	}
	
}
  
