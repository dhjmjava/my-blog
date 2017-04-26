package com.boot.dh.dao;

import java.util.List;

public interface BaseDao<T>{
	
	/**
	 * 查找所有
	 * @return
	 */
	public List<T> findAll();
	
	/**
	 * 更新或者保存数据
	 * @param bean
	 * @return
	 */
	public T save(T bean);
	
	/**
	 * 通过id查找
	 * @param id
	 * @return
	 */
	public T findById(long id);
	
}
