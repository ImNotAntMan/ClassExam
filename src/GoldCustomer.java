
public class GoldCustomer extends Customer {
	double saleRatio;
	
	public GoldCustomer() {
		
	}
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		this.customerGrade = "Gold";
		this.bonusRatio = 0.02;
		this.saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price*this.bonusRatio;
		return price - (int)(price*this.saleRatio);
	}
	
	public String customerShowInfo() {
		return super.showCustomerInfo();
	}
}
