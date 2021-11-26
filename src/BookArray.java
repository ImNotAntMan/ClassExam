
public class BookArray {

	public static void main(String[] args) {
		// book 배열 테스트
		Book[] library = new Book[5];
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
		}
		
		library[0] = new Book("조정래", "태백산맥");
		library[1] = new Book("헤르만 헷세", "데미안");
		library[2] = new Book("유시민", "어떻게 살 것인가");
		library[3] = new Book("박경리", "토지");
		library[4] = new Book("생텍쥐페리", "어린왕자");
		
		for(int i = 0; i < library.length; i++) {
			library[i].showBookInfo();
		}
		
		for(int i = library.length ;i > library.length - i; i++)
	}

}
