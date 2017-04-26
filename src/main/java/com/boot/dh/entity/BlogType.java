package com.boot.dh.entity;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;import javax.persistence.Id;import javax.persistence.Table;@Entity@Table(name="blogtype")public class BlogType implements java.io.Serializable {	/**  	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).  	 * @since JDK 1.7  	 */	 	private static final long serialVersionUID = -8436758490590285623L;	@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)	private long id;		@Column(name="name")	private String name;		@Column(name="isuse")	private boolean isUse;		@Column(name="describe")	private String describe;		public BlogType(){}	public BlogType(long id, String name, boolean isUse, String describe) {		super();		this.id = id;		this.name = name;		this.isUse = isUse;		this.describe = describe;	}	public long getId() {		return id;	}	public void setId(long id) {		this.id = id;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public boolean getIsUse() {		return isUse;	}	public void setIsUse(boolean isUse) {		this.isUse = isUse;	}	public String getDescribe() {		return describe;	}	public void setDescribe(String describe) {		this.describe = describe;	}	}