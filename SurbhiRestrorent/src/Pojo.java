
public class Pojo {
	
	private int mid;
	private String mname;
	private int price;
	private int qty;
	
	public Pojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pojo(int mid, String mname, int price, int qty) {
		super();
		this.mid = mid;
		this.mname = mname;
		this.price = price;
		this.qty = qty;
	}
	
	@Override
	public String toString() {
		return "Pojo [mid=" + mid + ", mname=" + mname + ", price=" + price + ", qty=" + qty + "]";
	}

	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}

}
