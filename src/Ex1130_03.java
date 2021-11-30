// Book 객체를 3개 생성하고 책을 3개 저장
// 저장된 책을 복사.
// 원본, 사본 출력
// 복사후에 사본의 3번째 책을 "자바프로그래밍", "홍길동"으로 업데이트
// 원본, 사본 출력
// 원본의 2번째 책을 "자바", "김삿갓"으로 업데이트
// 원본, 사본 출력

public class Ex1130_03 {

	public static void main(String[] args) {
		//
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게살것인가?", "유시민");
		
		String[] strArr = {"자바", "안드로이드", "씨", "자바스크립트", "파이썬"};
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i] = new Book(bookArray1[i].getBookName(), bookArray1[i].getAuthor());
		}
		
		System.out.println("============= 원본 =============");
		for(int i = 0; i < bookArray1.length; i++) {	// 원본
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("============= 사본 =============");
		for(int i = 0; i < bookArray2.length; i++) {	// 사본
			bookArray2[i].showBookInfo();
		}
		
		bookArray2[2].setBookName("자바프로그래밍");
		bookArray2[2].setAuthor("홍길동");
		
		System.out.println("============= 원본 =============");
		for(int i = 0; i < bookArray1.length; i++) {	// 원본
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("============= 사본 =============");
		for(int i = 0; i < bookArray2.length; i++) {	// 사본
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[1].setBookName("자바");
		bookArray1[1].setAuthor("김삿갓");
		
		System.out.println("============= 원본 =============");
		for(int i = 0; i < bookArray1.length; i++) {	// 원본
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("============= 사본 =============");
		for(int i = 0; i < bookArray2.length; i++) {	// 사본
			bookArray2[i].showBookInfo();
		}
		
		for(String lang : strArr) {
			System.out.println(lang);
		}
		
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ");
		}
	}

}
