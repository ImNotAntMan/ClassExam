
public class CustomerTest1 {

	public static void main(String[] args) {
		// 클래스 상속 테스트
		Customer cus = new Customer();	// 상위클래스 객체 생성
		VIPCustomer vip = new VIPCustomer();	// 하위 클래스 객체 생성
		System.out.println(vip.bonusPoint); // 상위클래스의 멤버변수 사용 가능
		System.out.println(vip.customerID);	// protected로 선언되었을 경우 접근 가능
		

	}

}
