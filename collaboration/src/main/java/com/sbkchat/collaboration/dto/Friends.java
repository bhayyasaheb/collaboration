package com.sbkchat.collaboration.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Friends implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2397635129162780394L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="generator")
	@SequenceGenerator(name = "generator", sequenceName="friend_list_seq",allocationSize=1)
	private Long id;
	
	@Column(name = "initiator_id")
	private Long initiatorId;
	
	@Column(name = "friend_id")
	private Long friendId;
	
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getInitiatorId() {
		return initiatorId;
	}

	public void setInitiatorId(Long initiatorId) {
		this.initiatorId = initiatorId;
	}

	public Long getFriendId() {
		return friendId;
	}

	public void setFriendId(Long friendId) {
		this.friendId = friendId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Friends [id=" + id + ", initiatorId=" + initiatorId + ", friendId=" + friendId + ", status=" + status
				+ "]";
	}
	
	
}
