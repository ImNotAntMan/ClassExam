// Book ��ü�� 3�� �����ϰ� å�� 3�� ����
// ����� å�� ����.
// ����, �纻 ���
// �����Ŀ� �纻�� 3��° å�� "�ڹ����α׷���", "ȫ�浿"���� ������Ʈ
// ����, �纻 ���
// ������ 2��° å�� "�ڹ�", "���"���� ������Ʈ
// ����, �纻 ���

public class Ex1130_03 {

	public static void main(String[] args) {
		//
		
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("�¹���", "������");
		bookArray1[1] = new Book("���̾�", "�츣�� �켼");
		bookArray1[2] = new Book("��Ի���ΰ�?", "���ù�");
		
		String[] strArr = {"�ڹ�", "�ȵ���̵�", "��", "�ڹٽ�ũ��Ʈ", "���̽�"};
		
		for(int i = 0; i < bookArray2.length; i++) {
			bookArray2[i] = new Book(bookArray1[i].getBookName(), bookArray1[i].getAuthor());
		}
		
		System.out.println("============= ���� =============");
		for(int i = 0; i < bookArray1.length; i++) {	// ����
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("============= �纻 =============");
		for(int i = 0; i < bookArray2.length; i++) {	// �纻
			bookArray2[i].showBookInfo();
		}
		
		bookArray2[2].setBookName("�ڹ����α׷���");
		bookArray2[2].setAuthor("ȫ�浿");
		
		System.out.println("============= ���� =============");
		for(int i = 0; i < bookArray1.length; i++) {	// ����
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("============= �纻 =============");
		for(int i = 0; i < bookArray2.length; i++) {	// �纻
			bookArray2[i].showBookInfo();
		}
		
		bookArray1[1].setBookName("�ڹ�");
		bookArray1[1].setAuthor("���");
		
		System.out.println("============= ���� =============");
		for(int i = 0; i < bookArray1.length; i++) {	// ����
			bookArray1[i].showBookInfo();
		}
		
		System.out.println("============= �纻 =============");
		for(int i = 0; i < bookArray2.length; i++) {	// �纻
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
