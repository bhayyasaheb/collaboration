package com.sbkchat.collaboration.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component
@Table(name="forum_post")
public class ForumPost implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6129834713759746960L;

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="generator")
	@SequenceGenerator(name="generator",sequenceName="forum_post_seq",allocationSize=1)
	@Column(name="forum_pid")
	private int id;
	
	@Column(name="forum_id")
	private int forumId;
	
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="user_profileId")
	private String userProfileId;
	
	private String title;
	
	@Column(name="forum_post_content")
	private String description;
	
	@Column(name="post_date")
	private LocalDate postDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getForumId() {
		return forumId;
	}

	public void setForumId(int forumId) {
		this.forumId = forumId;
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

	public String getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(String userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDate getPostDate() {
		return postDate;
	}

	public void setPostDate(LocalDate postDate) {
		this.postDate = postDate;
	}

	@Override
	public String toString() {
		return "ForumPost [id=" + id + ", forumId=" + forumId + ", userId=" + userId + ", userName=" + userName
				+ ", userProfileId=" + userProfileId + ", title=" + title + ", description=" + description
				+ ", postDate=" + postDate + "]";
	}
	
	
}
