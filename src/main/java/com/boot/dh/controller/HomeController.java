/**  
 * Project Name:blog  
 * File Name:HomeController.java  
 * Package Name:com.boot.dh.controller  
 * Date:2017年3月22日上午11:45:57  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.dh.entity.Blog;
import com.boot.dh.entity.BlogType;
import com.boot.dh.entity.Link;

/**
 * @author Administrator
 *
 */
@Controller
public class HomeController extends BaseController{
	
	@RequestMapping("/")
	@ResponseBody
	public Page<Link> getPage(@PageableDefault(value = 3, sort = { "id" }, direction = Direction.DESC) 
    Pageable pageable){
		System.out.println("1");
		return linkService.findLinkByPage(pageable);
	}

	@RequestMapping(value = "", method=RequestMethod.GET)
	@ResponseBody
	public Page<Link> home(@PageableDefault(value = 3, sort = { "id" }, direction = Direction.DESC) Pageable pageable){
		List<BlogType> types = blogTypeService.getAllType();
		List<Blog> blogs = blogService.fingAll();
		System.out.println("1");
		return linkService.findLinkByPage(pageable);
		/*model.addAttribute("blogs",blogs);
		model.addAttribute("model",types);*/
		//return "index";
	}
	
	@RequestMapping("/link.html")
	public String link(Model model){
		return "link";
	}
	
	@RequestMapping("/deleteLink")
	@ResponseBody
	public String deleteLinks(@RequestParam("ids[]") String[] ids,HttpServletRequest request){
		if(ids!=null&&ids.length>0){
			linkService.deleteLinks(ids);
		}
		return "";
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
		linkService.saveLink(link);
		
		return "";
	}
	
	@RequestMapping("/getAllLink")
	@ResponseBody
	public List<Link> getAllLink(){
		Link link = linkService.findById(3);
		System.out.println(link==null);
		return linkService.findAll();
	}
	

}
