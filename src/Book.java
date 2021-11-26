
public class Book {
	// 속성또는 멤버변수
	private String author;
	private String bookName;
		
	//생성자
	public Book() {
		
	}
	
	//오버로딩 된 생성자
	public Book(String author, String bookName) {
		this.author = author;
		this.bookName = bookName;
	}
	
	//메서드
	//get, set 문자열 규칙
	//get, set 다음에 멤버변수의 첫 글자를 대문자로 작성해야 함.
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public void showBookInfo() {
		System.out.println(getBookName() + ", " + getAuthor());
	}
	
	//오버로딩 된 메서드
	
	//진입점(보통 사용 안함) public static void main

}
