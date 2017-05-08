/**  
 * Project Name:springboot-shiro Maven Webapp  
 * File Name:SchedulingConfig.java  
 * Package Name:com.shiro.dh.jobtask  
 * Date:2017年3月22日下午3:07:36  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.jobtask;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;


/**
 * @author Administrator
 *
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {
	
	@Scheduled(cron = "0/10 * * * * ?") // 每10秒执行一次
	public void saysomething(){
		System.out.println("定时任务开始！！");
	    //User user = userService.findUserById(1);
		System.out.println("it is so easy!!");
	}

}
