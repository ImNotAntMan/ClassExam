import java.util.*;
public class RentProduct {
	//멤버변수
	private String customerName;
	private int customerID;
	private ArrayList<Product> productList;
	
	public RentProduct(String customerName, int customerID) {
		this.customerName =  customerName;
		this.customerID = customerID;
		this.productList = new ArrayList<Product>();
	}
	
	public void addProductList(String productName, int unitPrice, int qty,  String discountRatio) {
		Product product = new Product();
		product.setProductName(productName);
		product.setRentPrice(unitPrice);
		product.setQty(qty);
		product.setDiscountRate(discountRatio);
		productList.add(product);
	}
	
	public String getCustomerName() {
		return this.customerName;
	}
	
	public int getCustomerID() {
		return this.customerID;
	}
	
	public void showProductList() {
		int total = 0;
		int i = 0;
		int vatTotal = 0;
		String vat = "";
		System.out.println("=========================================================");
		System.out.println("성명: " + this.getCustomerName());
		System.out.println("고객번호: " + this.getCustomerID());
		for(Product p : productList) {
			i++;
			total += p.getUnitPrice();
			vat = p.getDiscountRatio();
			System.out.println("품목: " + p.getProductName() +  "\t 단가: " + p.getUnitPrice() + "원" + "\t수량: " + p.getQty() + "\t가격: " + p.getQty()*p.getUnitPrice() + "원");
			if(p.getDiscountRatio() == "vat") {
				System.out.println("\t부가가치세: 0원");
			} else {
				vatTotal += p.getQty()*p.getUnitPrice()*0.1; 
				System.out.println("\t부가가치세: " + p.getQty()*p.getUnitPrice()*0.1 + "원");
			}
		} 
		if(total > 30000) {
			addProductList("고양이장갑", 1, 2000, "냥이");
			System.out.println("보너스: 계란 찜\t 가격: 2000원");
		}
		System.out.println("총액: \t\t" + total + "원(보너스 제외)");
		if(vat == "vat") {
			System.out.println("부가가치세: \t " +  "0원");
		} else {
			System.out.println("부가가치세: \t " + vatTotal + "원");			
		}
//		System.out.println("세금: \t\t" + total + (double)total * 0.1 + "원");
		double sum;
		sum = total + (double)total * 0.1;
		System.out.println("합계: \t\t" + sum + "원");
		System.out.println("=========================================================");
	}
}
