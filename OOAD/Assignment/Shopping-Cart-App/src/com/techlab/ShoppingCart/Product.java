package com.techlab.ShoppingCart;

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

	public int getProductDiscount() {
		return productDiscount;
	}

	public int getProductUnitPrice() {
		return productUnitPrice;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}
	
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productUnitPrice="
				+ productUnitPrice + ", productDiscount=" + productDiscount + ", productQuantity=" + productQuantity
				+ "]";
	}

}
