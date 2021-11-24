
public class Ex1123_02 {

	public static void main(String[] args) {
		// 인스턴스 생성해야 클래스 사용 가능
		//클래스명 변수명 = new 생성자
		//디폴트 생성자는 클래스명과 동일하면 매개변수 없음
		Ex1123_01 cal1 =  new Ex1123_01(118, 7);
//		System.out.println(cal1.add(10, 20));
		int test = cal1.add();	// 결과가 test에 저장 됨.
//		System.out.println(test);
		
		//곱셈 테스트
		test = cal1.multiplication();
//		System.out.println(test);
		
		//뺄셈 테스트
		test = cal1.subtract();
//		System.out.println(test);
		
		//나눗셈 테스트
//		test = cal1.divide();
//		System.out.println(test);
		
		//두번째 객체 생성 테스트
		Ex1123_01 cal2 = new Ex1123_01(23,5);
		cal2.setNum1(22);
		cal2.setNum2(7);
		cal2.add();
		cal2.subtract();
		cal2.multiplication();
		cal2.divide();
		
		//세번째 객체 생성 테스트
		Ex1123_01 cal3 = new Ex1123_01(10, 5);
		// 10 + 5 = 15 출력
		cal3.add();
		
		//네번째 객체 생성 테스트
		//디폴트 생성자로 생성 후 매개변수(9, 10) 추가하고 곱셈 출력 테스트
		Ex1123_01 cal4 = new Ex1123_01();
		cal4.setNum1(9);
		cal4.setNum2(10);
		cal4.multiplication();
		cal4.setNum1(13);
		cal4.multiplication();

	}
}
