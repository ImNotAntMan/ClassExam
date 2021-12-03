import java.util.*;
public class RentProduct {
	//�������
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
		System.out.println("����: " + this.getCustomerName());
		System.out.println("����ȣ: " + this.getCustomerID());
		for(Product p : productList) {
			i++;
			total += p.getUnitPrice();
			vat = p.getDiscountRatio();
			System.out.println("ǰ��: " + p.getProductName() +  "\t �ܰ�: " + p.getUnitPrice() + "��" + "\t����: " + p.getQty() + "\t����: " + p.getQty()*p.getUnitPrice() + "��");
			if(p.getDiscountRatio() == "vat") {
				System.out.println("\t�ΰ���ġ��: 0��");
			} else {
				vatTotal += p.getQty()*p.getUnitPrice()*0.1; 
				System.out.println("\t�ΰ���ġ��: " + p.getQty()*p.getUnitPrice()*0.1 + "��");
			}
		} 
		if(total > 30000) {
			addProductList("������尩", 1, 2000, "����");
			System.out.println("���ʽ�: ��� ��\t ����: 2000��");
		}
		System.out.println("�Ѿ�: \t\t" + total + "��(���ʽ� ����)");
		if(vat == "vat") {
			System.out.println("�ΰ���ġ��: \t " +  "0��");
		} else {
			System.out.println("�ΰ���ġ��: \t " + vatTotal + "��");			
		}
//		System.out.println("����: \t\t" + total + (double)total * 0.1 + "��");
		double sum;
		sum = total + (double)total * 0.1;
		System.out.println("�հ�: \t\t" + sum + "��");
		System.out.println("=========================================================");
	}
}
