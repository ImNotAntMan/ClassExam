
public class Ex1126_01 {

	public static void main(String[] args) {
		// 배열 테스트
		int[] stIDs = new int[10];	//정수형 배열 선언, 초기화 하지 않음
		
		int[] stArr1 = {101, 102, 103, 104, 105};	//배열 선언과 동시에 초기화
		int[] stArr2 = new int[] {101, 102, 103, 104, 105};	//위와 동일
		int[] stArr3;	//일단 선언
		stArr3 = new int[] {101, 102, 103};	//new 생략 불가.
		
		for(int i = 0; i < stArr1.length; i++) {//for문 안에서 선언 된 변수 i는 for문 안에서만 생존.
			System.out.println(stArr1[i]);
		}
				
		for(int i = 0; i < stArr1.length; i++) {//for문 안에서 선언 된 변수 i는 for문 안에서만 생존.
			System.out.println(stArr1[i]);
		}
	}

}
