package com.sbkchat.collaboration.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.stereotype.Component;

@Entity
@Component
public class Forum implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6131739677854804279L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="generator")
	@SequenceGenerator(name="generator",sequenceName="forum_seq",allocationSize=1)
	@Column(name="forum_id")
	private int id;
	
	@Column(name="forum_name")
	private String name;
	
	private String description;
	
	private String status;
	
	@Column(name="number_of_posts")
	private int noOfPosts;
	
	@Column(name="create_date")
	private LocalDate createDate;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getNoOfPosts() {
		return noOfPosts;
	}

	public void setNoOfPosts(int noOfPosts) {
		this.noOfPosts = noOfPosts;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@Override
	public String toString() {
		return "Forum [id=" + id + ", name=" + name + ", description=" + description + ", status=" + status
				+ ", noOfPosts=" + noOfPosts + ", createDate=" + createDate + ", userId=" + userId + ", userName="
				+ userName + "]";
	}
	
	
}
