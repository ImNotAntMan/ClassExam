
public class PersonTest {

	public static void main(String[] args) {
		// person class 테스트
		//오버로딩 된 생성자가 있을 경우 디폴트 생성자도 구현해야 함.
		Person hu1 = new Person(); //default 생성자
		Person hu2 = new Person("JGMIN"); //매개변수 1개 생성자
		
		System.out.println(hu2.getName());
		
		Person hu3 = new Person("민재기", 170, 74);
		hu3.getHuman();
		Person hu4 = new Person();
		hu4.setHuman("윤석열", 180, 74);
		System.out.println(hu4.getName());
		System.out.println(hu4.getHeight());
		System.out.println(hu4.getWeight());
		hu1.setHuman("이것들", 180, 78);
		System.out.println(hu1.getName());
		hu1.getHuman();
	}
}
