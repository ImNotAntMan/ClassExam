
public class Ex1130_02 {

	public static void main(String[] args) {
		// deep copy(일반적인 복사)
		// 객체배열 처리 
		Book[] bookArr1 = new Book[3];	//Book 개체를 저장할 배열변수 선언
		Book[] bookArr2 = new Book[3];
		
		// 객체 생성
		bookArr1[0] = new Book("태백산맥", "조정래");
		bookArr1[1] = new Book("데미안", "헤르만 헤세");
		bookArr1[2] = new Book("어떻게살것인가?", "유시민");
		
		for(int i = 0; i < bookArr2.length; i++) {	//초기화
			bookArr2[i] = new Book();	// 디폴트 생성자로 생성해둠
		}
	
		System.out.println("============= 원본 =============");
		for(int i = 0; i < bookArr1.length; i++) {	// 원본
			bookArr1[i].showBookInfo();
		}

		// 깊은 복사
		for(int i = 0; i < bookArr1.length; i++) {	// 원본
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		// 원본 수정
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
