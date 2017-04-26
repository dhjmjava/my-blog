package com.boot.dh.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.boot.dh.entity.BlogComment;

public interface BlogCommentDao extends PagingAndSortingRepository<BlogComment, String>,BaseDao<BlogComment>{
	

}
