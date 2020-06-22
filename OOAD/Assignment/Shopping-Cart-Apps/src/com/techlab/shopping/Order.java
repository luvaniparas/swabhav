package com.techlab.shopping;

import java.io.Serializable;
import java.text.ParseException;
import java.time.LocalDate;

public class Order implements Serializable {

	private int orderId;
	private LocalDate orderDate;
	private LineItem li;

	public Order(int orderId, LineItem li) throws ParseException {
		this.orderId = orderId;
		this.orderDate = java.time.LocalDate.now();
		this.li = li;
	}

	public int getOrderId() {
		return orderId;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public LineItem getLi() {
		return li;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		String result = "";
		result += "Order => OrderId = " + orderId + ", OrderDate = " + orderDate + "\n";

		if (li == null) {
			result += "No LineItem ): ";
		} else {
			result += li.toString();
		}
		return result;
	}

}