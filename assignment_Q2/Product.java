package assignment_Q2;

public class Product {

	private int productId;
	private String productName;
	private double rate;
	private int quality;
	private double amount;
	private double discount;
	private double netAmount;

	public Product(int productId, int quality) {
		this.productId = productId;
		productName = "Pen";
		rate = 10;
		this.quality = quality;
	}

	public void dicount() {
		amount = quality * rate;

		if (quality >= 20) {
			discount = 20;
			discount = (discount / 100) * amount;
			netAmount = amount - discount;
		} else {
			discount = 10;
			discount = (discount / 100) * amount;
			netAmount = amount - discount;
		}
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public int getQuality() {
		return quality;
	}

	public void setQuality(int quality) {
		this.quality = quality;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(double netAmount) {
		this.netAmount = netAmount;
	}

	public void display() {
		System.out.println("Product_Id : " + productId + "\nProduct_Name : " + productName + "\nRate : " + rate
				+ "\nQuantity : " + quality + "\nAmount : " + amount + "\nDiscount : " + discount + "\nNet_Amount : "
				+ netAmount);
	}

}
