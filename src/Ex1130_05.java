import java.util.*;
public class Ex1130_05 {

	public static void main(String[] args) {
		// ArrayList 클래스 활용
		ArrayList<Book> library = new ArrayList<Book>();	// 제너릭 타입으로 생성
		
		System.out.println("==================================================");
		for(int i = 0; i < library.size(); i++) {
			// 임시 변수로 반화
			Book book = library.get(i);	// 객체 반환
			book.showBookInfo();
		}
		library.add(new Book("태백산맥", "조정래"));	// inline 객체 생성
		library.add(new Book("데미안", "헤르만헤세"));
		library.add(new Book("거꾸로읽는세계사", "유시민"));
		library.add(new Book("물질문명과 자본주의", "페르낭브로텔"));
		System.out.println("==================================================");
		for(int i = 0; i < library.size(); i++) {
			// 임시 변수로 반화
			Book book = library.get(i);	// 객체 반환
			book.showBookInfo();
		}
		System.out.println("==================================================");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
