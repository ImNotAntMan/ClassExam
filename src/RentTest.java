
public class RentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentProduct rentProduct1 = new RentProduct("�����", 4444);
		rentProduct1.addProductList("��ġ", 3000, 3, "dog");
		rentProduct1.addProductList("����", 1000, 1, "dog");
		rentProduct1.addProductList("��ġ", 23000, 2, "dog");

		RentProduct rentProduct2 = new RentProduct("������", 5555);
		rentProduct2.addProductList("����", 3000, 9, "dog");
		rentProduct2.addProductList("���� 12�κ�", 12000, 11, "dog");
		rentProduct2.addProductList("�Ұ�� 12�κ�", 32000, 11, "dog");

		RentProduct rentProduct3 = new RentProduct("�����", 2222);
		rentProduct3.addProductList("���ִ뺴", 13000, 2, "cow");
		rentProduct3.addProductList("��Ź", 63000, 1, "cow");
		rentProduct3.addProductList("������22", 930000, 1, "cow");
		rentProduct3.addProductList("����", 300000, 1, "cow");
		rentProduct3.addProductList("���콺", 30000, 1, "cow");

		RentProduct rentProduct4 = new RentProduct("�̵���", 1111);
		rentProduct4.addProductList("���ؼ���", 3000, 7, "dog");
		rentProduct4.addProductList("��Ź", 63000, 1, "dog");
		rentProduct4.addProductList("������21", 900000, 1, "dog");
		rentProduct4.addProductList("����", 220000, 1, "dog");
		rentProduct4.addProductList("���콺", 530000, 1, "dog");
		
		RentProduct rentProduct5 = new RentProduct("�ʹ̳�", 3333);
		rentProduct5.addProductList("����", 2000, 7, "vat");
		rentProduct5.addProductList("�κ�", 3000, 1, "vat");
		rentProduct5.addProductList("20kg ��", 60000, 1, "vat");
		rentProduct5.addProductList("���ɸ�", 2000, 7, "vat");
		rentProduct5.addProductList("��â", 13000, 2, "dog");

		rentProduct1.showProductList();
		rentProduct2.showProductList();
		rentProduct3.showProductList();
		rentProduct4.showProductList();
		rentProduct5.showProductList();
	}

}
