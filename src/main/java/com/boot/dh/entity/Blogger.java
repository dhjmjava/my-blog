package com.boot.dh.entity;import java.util.Date;import javax.persistence.Column;import javax.persistence.Entity;import javax.persistence.GeneratedValue;import javax.persistence.GenerationType;import javax.persistence.Id;import javax.persistence.Table;@Entity@Table(name="blogger")public class Blogger implements java.io.Serializable {	private static final long serialVersionUID = 4010147798076474862L;		@Id	@GeneratedValue(strategy=GenerationType.IDENTITY)	private long id;		@Column(name="name")	private String name;		@Column(name="user_name")	private String userName;		@Column(name="password")	private String password;		@Column(name="email")	private String email;		@Column(name="describe")	private String describe;		@Column(name="is_lucked")	private boolean isLucked;/** 0-锁定 1-不锁定 **/		@Column(name="first_login_time")	private Date firstLoginTime;/** 第一次登陆时间 **/		@Column(name="last_login_time")	private Date lastLoginTime;/** 最后一次登陆时间 **/		@Column(name="ip")	private String ip;/** 登陆ip **/		@Column(name="image_path")	private String imagePath;		@Column(name="motto")	private String motto ;//座右铭			public Blogger(){}	public Blogger(long id, String name, String userName, String password, String email, String describe, boolean isLucked, Date firstLoginTime, Date lastLoginTime, String ip, String imagePath,String motto) {		super();		this.id = id;		this.name = name;		this.userName = userName;		this.password = password;		this.email = email;		this.describe = describe;		this.isLucked = isLucked;		this.firstLoginTime = firstLoginTime;		this.lastLoginTime = lastLoginTime;		this.ip = ip;		this.imagePath = imagePath;		this.motto = motto;	}	public long getId() {		return id;	}	public void setId(long id) {		this.id = id;	}	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getUserName() {		return userName;	}	public void setUserName(String userName) {		this.userName = userName;	}	public String getPassword() {		return password;	}	public void setPassword(String password) {		this.password = password;	}	public String getEmail() {		return email;	}	public void setEmail(String email) {		this.email = email;	}	public String getDescribe() {		return describe;	}	public void setDescribe(String describe) {		this.describe = describe;	}	public boolean isLucked() {		return isLucked;	}	public void setLucked(boolean isLucked) {		this.isLucked = isLucked;	}	public Date getFirstLoginTime() {		return firstLoginTime;	}	public void setFirstLoginTime(Date firstLoginTime) {		this.firstLoginTime = firstLoginTime;	}	public Date getLastLoginTime() {		return lastLoginTime;	}	public void setLastLoginTime(Date lastLoginTime) {		this.lastLoginTime = lastLoginTime;	}	public String getIp() {		return ip;	}	public void setIp(String ip) {		this.ip = ip;	}	public String getImagePath() {		return imagePath;	}	public void setImagePath(String imagePath) {		this.imagePath = imagePath;	}	public String getMotto() {		return motto;	}	public void setMotto(String motto) {		this.motto = motto;	}	}