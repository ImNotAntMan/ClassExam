
public class Book {
	// �Ӽ��Ǵ� �������
	private String author;
	private String bookName;
		
	//������
	public Book() {
		
	}
	
	//�����ε� �� ������
	public Book(String author, String bookName) {
		this.author = author;
		this.bookName = bookName;
	}
	
	//�޼���
	//get, set ���ڿ� ��Ģ
	//get, set ������ ��������� ù ���ڸ� �빮�ڷ� �ۼ��ؾ� ��.
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
	
	//�����ε� �� �޼���
	
	//������(���� ��� ����) public static void main

}
