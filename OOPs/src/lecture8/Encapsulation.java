package lecture8;

class menu{
	private String DishName;
	private int Price;
	public String getDishName() {
		return DishName;
	}
	public void setDishName(String dishName) {
		DishName = dishName;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
}
public class Encapsulation {
	
	public static void main(String[] args) {
		menu m1=new menu();
		m1.setDishName("Veg Pulav");
		m1.setPrice(200);
		System.out.println("Current menu with Price:\n"+ m1.getDishName() + " Rupees " + m1.getPrice());
	}

}
