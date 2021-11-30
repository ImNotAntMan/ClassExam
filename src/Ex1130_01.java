
public class Ex1130_01 {

	public static void main(String[] args) {
		// 배열 얕은 복사(shallow copy)
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1,2,3,4,5};
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		//기본타입의 복사는 독립적(int, double, float, char, ........)
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		array1[2] = 300;	// 배열1 수정
		// 배열1 확인(수정됨)
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		// 배열2 리스트하면 변화 없음.
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		// 객체배열 처리 deep copy 선언
		Book[] bookArr1 = new Book[3];	//Book 개체를 저장할 배열변수 선언
		Book[] bookArr2 = new Book[3];
		
		Book aaa;	//선언
		aaa = new Book("aaa", "bbb");	//생성
		
		// 객체 생성
		bookArr1[0] = new Book("태백산맥", "조정래");
		bookArr1[1] = new Book("데미안", "헤르만 헤세");
		bookArr1[2] = new Book("어떻게살것인가?", "유시민");
		
		System.out.println("============= 원본 =============");
		for(int i = 0; i < bookArr1.length; i++) {	// 원본
			bookArr1[i].showBookInfo();
		}
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);	//얕은 복사(shallow copy)
		System.out.println("============= 사본 =============");
		for(int i = 0; i < bookArr2.length; i++) {	// 사본
			bookArr2[i].showBookInfo();
		}
		//원본 수정
		bookArr1[0].setAuthor("박완서");
		bookArr1[0].setBookName("나목");

		System.out.println("============= 원본 =============");
		for(int i = 0; i < bookArr1.length; i++) {	// 원본
			bookArr1[i].showBookInfo();
		}

		System.out.println("============= 사본 =============");
		for(int i = 0; i < bookArr2.length; i++) {	// 사본
			bookArr2[i].showBookInfo();
		}
	}
}
