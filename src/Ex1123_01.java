
public class Ex1123_01 {
	//사칙연산기
	int result;	//연산결과저장용 속성
	int num1;
	int num2;
	
	public Ex1123_01() {
		
	}

	//생성자(클래스명과 동일, 반환타입 없음(return도 없음), 나머지는 메서드 정의 방법과 동일)
	//오버로드 된 생성자
	public Ex1123_01(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}
		
	//데이터 쓰기
	public void setNum1(int n1) {
		num1 = n1;
	}
	
	public void setNum2(int n1) {
		num2 = n1;
	}
	
	//데이터 읽기
	public int getNum1() {
		return num1;
	}
	
	public int getNum2() {
		return num2;
	}
	
	//덧셈 메서드
	public int add() {	//public 반환타입 메서드명(매개변수 리스트)
		result = num1 + num2;	//덧셈 실행
		System.out.println(num1 + " + " + num2  + " = " + result + " 입니다.");
		return 0;
	}
	
	//뺄셈 메서드
	public int subtract() {
		result = num1 - num2;
		System.out.println(num1 + " - " + num2  + " = " + result + " 입니다.");
		return 0;
	}
	
	//곱셈 메서드
	public int multiplication() {
		result = num1 * num2;
		System.out.println(num1 + " X " + num2  + " = " + result + " 입니다.");
		return 0;
	}
	
	//나눗셈 메서드
	public int divide() {
		result = num1 / num2;
		System.out.println(num1 + " / " + num2  + " = " + result + " 입니다.");
		return 0;
	}

}
