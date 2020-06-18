package com.techlab.ShoppingCart;

import java.time.LocalDate;
import java.util.LinkedList;

import com.techlab.ShoppingCart.Test.ShoppingTest;

public class Order {

	private int OrderId;
	private String OrderCategory;
	private LocalDate OrderDate;
	private LineItem lItem;

	public Order(int orderId, String OrderCategory, LineItem lItem) {
		this.OrderId = orderId;
		this.OrderCategory = OrderCategory;
		this.lItem = lItem;
		OrderDate = LocalDate.now();

	}

	public int getOrderId() {
		return OrderId;
	}

	public String getOrderCategory() {
		return OrderCategory;
	}

	public LocalDate getOrderDate() {
		return OrderDate;
	}

	public LineItem getlItem() {
		return lItem;
	}
	
	@Override
	public String toString() {
		return "Order [OrderId=" + OrderId + ", OrderCategory=" + OrderCategory + ", OrderDate=" + OrderDate
				+ ", lItem=" + lItem + "]";
	}

}
