package com.techlab.shopping;

public class Product {

	private int productId;
	private String productName;
	private int productUnitPrice, productDiscount, productQuantity;

	public Product(int productId, String productName, int productUnitPrice, int productDiscount) {
		this.productId = productId;
		this.productName = productName;
		this.productUnitPrice = productUnitPrice;
		this.productDiscount = productDiscount;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductUnitPrice() {
		return productUnitPrice;
	}

	public int getProductDiscount() {
		return productDiscount;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
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
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProductId=" + productId + ", ProductName=" + productName + ", ProductUnitPrice=" + productUnitPrice
				+ ", ProductDiscount=" + productDiscount + ", ProductQuantity=" + productQuantity;
	}

}
