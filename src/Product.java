
public class Product {
	private String productName;
	private int unitRentPrice;
	private int qty;
	private String discountRate; //Dog 5, Cow 10, Cat 20, vat 賊撮 六六六六
	
//	public Product(String productName, int unitRentPrice, int qty,  String discountRate) {
//		this.productName = productName;
//		this.rentPrice = rentPrice;
//		this.discountRate = discountRate;
//	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public void setRentPrice(int unitRentPrice) {
		this.unitRentPrice = unitRentPrice;
	}
	
	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}
	
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public int getUnitPrice() {
		return this.unitRentPrice;
	}
	
	public String getDiscountRatio() {
		return this.discountRate;
	}
	
	public int getQty() {
		return this.qty;
	}
}
