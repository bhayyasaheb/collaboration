package com.sbkchat.collaboration.dto;

public class Message {

	private long id;
	
	private String message;
	
	public Message() {
		
	}

	public Message(long id, String message) {
		super();
		this.id = id;
		this.message = message;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
