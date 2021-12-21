
public class BookClass {	// objcet 클래스의 하위클래스
	int bookNumber;
	String bookTitle;
	
	public BookClass(int bookNumber, String bookTitle) {
		this.bookNumber =  bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		return bookTitle + ":" + bookNumber;
	}
	
}
