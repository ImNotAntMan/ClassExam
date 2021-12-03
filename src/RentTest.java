
public class RentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RentProduct rentProduct1 = new RentProduct("민재기", 4444);
		rentProduct1.addProductList("망치", 3000, 3, "dog");
		rentProduct1.addProductList("양초", 1000, 1, "dog");
		rentProduct1.addProductList("김치", 23000, 2, "dog");

		RentProduct rentProduct2 = new RentProduct("윤석열", 5555);
		rentProduct2.addProductList("소주", 3000, 9, "dog");
		rentProduct2.addProductList("삼겹살 12인분", 12000, 11, "dog");
		rentProduct2.addProductList("소고기 12인분", 32000, 11, "dog");

		RentProduct rentProduct3 = new RentProduct("이재명", 2222);
		rentProduct3.addProductList("소주대병", 13000, 2, "cow");
		rentProduct3.addProductList("식탁", 63000, 1, "cow");
		rentProduct3.addProductList("갤럭시22", 930000, 1, "cow");
		rentProduct3.addProductList("의자", 300000, 1, "cow");
		rentProduct3.addProductList("마우스", 30000, 1, "cow");

		RentProduct rentProduct4 = new RentProduct("이동형", 1111);
		rentProduct4.addProductList("보해소주", 3000, 7, "dog");
		rentProduct4.addProductList("식탁", 63000, 1, "dog");
		rentProduct4.addProductList("갤럭시21", 900000, 1, "dog");
		rentProduct4.addProductList("의자", 220000, 1, "dog");
		rentProduct4.addProductList("마우스", 530000, 1, "dog");
		
		RentProduct rentProduct5 = new RentProduct("너미녀", 3333);
		rentProduct5.addProductList("상추", 2000, 7, "vat");
		rentProduct5.addProductList("두부", 3000, 1, "vat");
		rentProduct5.addProductList("20kg 쌀", 60000, 1, "vat");
		rentProduct5.addProductList("막걸리", 2000, 7, "vat");
		rentProduct5.addProductList("막창", 13000, 2, "dog");

		rentProduct1.showProductList();
		rentProduct2.showProductList();
		rentProduct3.showProductList();
		rentProduct4.showProductList();
		rentProduct5.showProductList();
	}

}
