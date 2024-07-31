package List;

public class Post {
	
	private int postId;
	private String postName;
	private String postComments;
	private String postDate;
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
	public String getPostComments() {
		return postComments;
	}
	public void setPostComments(String postComments) {
		this.postComments = postComments;
	}
	public String getPostDate() {
		return postDate;
	}
	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}
	public Post(int postId, String postName, String postComments, String postDate) {
		super();
		this.postId = postId;
		this.postName = postName;
		this.postComments = postComments;
		this.postDate = postDate;
	}
	public Post() {
		// TODO Auto-generated constructor stub
	}
	
	
}
