
public class VIPCustomer extends Customer {
	
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		this.agentID = agentID;
	}
		
	public int calcPrice(int price) {
		this.bonusPoint += price*this.bonusRatio;
		return price - (int)(price*this.saleRatio);
	}
		
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 담담자 번호는 " + this.agentID;
	}
		
	public int getAgentID() {
		return this.agentID;
	}
}
