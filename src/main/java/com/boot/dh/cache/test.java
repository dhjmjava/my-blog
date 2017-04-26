/**  
 * Project Name:springbootDemo Maven Webapp  
 * File Name:test.java  
 * Package Name:com.boot.dh.cache  
 * Date:2017年4月19日下午3:14:57  
 * Copyright (c) 2017, jingmendh@163.com All Rights Reserved.  
 *  
*/  
  
package com.boot.dh.cache;  
/**  
 * ClassName:test <br/>  
 * Function: TODO ADD FUNCTION. <br/> 
 * Date:     2017年4月19日 下午3:14:57 <br/>  
 * @author   daihui  
 * @version    
 * @since    JDK 1.7  
 * @see        
 */
public class test {

	public static void main(String[] args) {
        String[] ids={"1","2","3","4"};
		String sql = "delete from Link l where l.id in ( ";
		for (String str:ids) {
			sql=String.format("%s%s,",sql,str);
			System.out.println(sql);
        }
		sql=sql.substring(0, sql.length()-1)+" )"; 
		System.out.println(sql);

	}

}
  
