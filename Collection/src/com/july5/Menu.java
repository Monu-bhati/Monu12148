package com.july5;

public class Menu {

	private int menuId;
	
	private String menuName;
	
	private double prise;
	
	private int qty;

	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", prise=" + prise + ", qty=" + qty + "]";
	}

	public Menu(int menuId, String menuName, double prise, int qty) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.prise = prise;
		this.qty = qty;
	}

	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public double getPrise() {
		return prise;
	}

	public void setPrise(double prise) {
		this.prise = prise;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
}
