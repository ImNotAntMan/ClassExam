
public class Customer {
	protected int customerID;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		initCustomer();
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		initCustomer();
	}
	
	private void initCustomer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public int calcPrice(int price) {
		this.bonusPoint += price*this.bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return this.customerName + "님의 등급은 " + this.customerGrade + "이며, 보너스 포인트는 " + this.bonusPoint + "입니다.";
	}
}
