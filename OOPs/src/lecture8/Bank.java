package lecture8;
class BankInfo{
	private int id;
	private String name;
	private String address;
	private long contact;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long  contact) {
		this.contact = contact;
	}
	
}
public class Bank {

	public static void main(String[] args) {
		BankInfo b1 = new BankInfo();
		b1.setAddress("Thane");
		b1.setContact(720843228);
		b1.setId(101);
		b1.setName("Monu");

		System.out.println("Name: "+b1.getName() +"\nId: " + b1.getId() + "\nAddress: " + b1.getAddress() + "\nContact: " +b1.getContact());
	}

}
