package com.july9;

public class Post {

	private int postId;
	
	private String postName;
private String comments;
	
	private String date;
	public Post(int postId, String postName, String comments, String date) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.comments = comments;
		this.date = date;
	}

	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPostId() {
		return postId;
	}

	public void setPostId(int postId) {
		this.postId = postId;
	}

	public String getPostName() {
		return postName;
	}

	public void setPostName(String postName) {
		this.postName = postName;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	
	
}
