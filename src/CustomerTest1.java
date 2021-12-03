import java.util.*;
public class CustomerTest1 {

	public static void main(String[] args) {
		// Ŭ���� ��� �׽�Ʈ
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		Customer a1 = new Customer(1001, "�̼���");
		Customer a2 = new Customer(1002, "������");
		Customer a3 = new Customer(1003, "������");
		Customer a4 = new VIPCustomer(1004, "ȫ�浿", 1234);
		Customer a5 = new GoldCustomer(1005, "�����");
		Customer a6 = new GoldCustomer(1006, "������");
		
		customerList.add(a1);
		customerList.add(a2);
		customerList.add(a3);
		customerList.add(a4);
		customerList.add(a5);
		customerList.add(a6);
		a4.bonusPoint = 5000;
		a5.bonusPoint = 1000;
		a6.bonusPoint = 1000;
		
		for(int i = 0; i < customerList.size(); i++) {
			Customer abc = customerList.get(i);
			System.out.println(abc.showCustomerInfo());
		}
		
		for(Customer item : customerList) {
			System.out.println(item.showCustomerInfo());
		}
		int price = 10000;
		for(Customer item :  customerList) {
			int cost = item.calcPrice(price);
			System.out.println("����: " + item.getCustomerName() + " �ݾ�: " + cost + "��");
		}
		for(Customer item : customerList) {
			System.out.println(item.showCustomerInfo());
		}
	}
}
