package com.boot.dh.entity;import java.util.Date;import java.util.List;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;import javax.persistence.Id;import javax.persistence.Table;import javax.persistence.Transient;@Entity@Table(name="blog")public class Blog implements java.io.Serializable {		/**  	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).  	 * @since JDK 1.7  	 */	 	private static final long serialVersionUID = 1135042213682650700L;	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)	private long id;		@Column(name="title")	private String title;		@Column(name="content")	private String content;		@Column(name="publish_time")	private Date publishTime;		@Column(name="author")	private String author;		@Column(name="keyword")	private String keyword;		@Column(name="is_use")	private boolean isUse;/** 是否显示 0-不显示 1-显示 **/		@Column(name="blogType")	private int blogType;		@Column(name="read_count")	private int readCount;//阅读量		//blog下的评论	@Transient	private List<BlogComment> comments;		//每月博客数	@Transient	private int blogCount;	//月份	@Transient	private String months;		//各类型总数	@Transient	private int typeCount;		//类型名称	@Transient	private String name;		public Blog(){};	public Blog(long id, String title, String content, Date publishTime, String author, String keyword, boolean isUse, int blogType, int readCount, List<BlogComment> comments, int blogCount,			String months,int typeCount,String name) {		super();		this.id = id;		this.title = title;		this.content = content;		this.publishTime = publishTime;		this.author = author;		this.keyword = keyword;		this.isUse = isUse;		this.blogType = blogType;		this.readCount = readCount;		this.comments = comments;		this.blogCount = blogCount;		this.months = months;		this.typeCount = typeCount;		this.name = name;	}		public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public int getTypeCount() {		return typeCount;	}	public void setTypeCount(int typeCount) {		this.typeCount = typeCount;	}	public int getBlogCount() {		return blogCount;	}	public void setBlogCount(int blogCount) {		this.blogCount = blogCount;	}	public String getMonths() {		return months;	}	public void setMonths(String months) {		this.months = months;	}	public int getReadCount() {		return readCount;	}	public void setReadCount(int readCount) {		this.readCount = readCount;	}	public long getId() {		return id;	}	public void setId(long id) {		this.id = id;	}	public String getTitle() {		return title;	}	public void setTitle(String title) {		this.title = title;	}	public String getContent() {		return content;	}	public void setContent(String content) {		this.content = content;	}	public Date getPublishTime() {		return publishTime;	}	public void setPublishTime(Date publishTime) {		this.publishTime = publishTime;	}	public String getAuthor() {		return author;	}	public void setAuthor(String author) {		this.author = author;	}	public String getKeyword() {		return keyword;	}	public void setKeyword(String keyword) {		this.keyword = keyword;	}	public boolean getIsUse() {		return isUse;	}	public void setIsUse(boolean isUse) {		this.isUse = isUse;	}	public int getBlogType() {		return blogType;	}	public void setBlogType(int blogType) {		this.blogType = blogType;	}	public List<BlogComment> getComments() {		return comments;	}	public void setComments(List<BlogComment> comments) {		this.comments = comments;	}	}