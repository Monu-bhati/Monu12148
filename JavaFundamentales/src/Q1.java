class Post{
	
	private int PId;
	private String Pname;
	private String Pcomments;
	private String Ppersonname;
 
	
	public Post() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Post(int pId, String pname, String pcomments, String ppersonname) {
		super();
		PId = pId;
		Pname = pname;
		Pcomments = pcomments;
		Ppersonname = ppersonname;
	}
	
	
	public int getPId() {
		return PId;
	}
	public void setPId(int pId) {
		PId = pId;
	}
	
	
	public String getPname() {
		return Pname;
	}
	public void setPname(String pname) {
		Pname = pname;
	}
	
	
	public String getPcomments() {
		return Pcomments;
	}
	public void setPcomments(String pcomments) {
		Pcomments = pcomments;
	}
	
	
	public String getPpersonname() {
		return Ppersonname;
	}
	public void setPpersonname(String ppersonname) {
		Ppersonname = ppersonname;
	}
	
}
