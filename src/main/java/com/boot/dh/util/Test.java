/**  
 * Project Name:blog  
 * File Name:Test.java  
 * Package Name:com.boot.dh.util  
 * Date:2017年3月28日下午3:24:08  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
 */
package com.boot.dh.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String[] ids={"1","2","3"};
		String sql ="delete from table where id in ( "; 
		for (String str:ids) {
			sql=String.format("%s%s,",sql,str);
        }
		sql=sql.substring(0, sql.length()-1)+" )";
		System.out.println(sql);

	}
	
	public void sort(){
		
		List<Integer> nums = new ArrayList<>();
		nums.add(1);
		nums.add(5);
		nums.add(6);
		nums.add(2);
		int[] num= {1,5,6,4,2};
		
	}
}
