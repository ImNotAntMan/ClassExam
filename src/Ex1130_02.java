
public class Ex1130_02 {

	public static void main(String[] args) {
		// deep copy(�Ϲ����� ����)
		// ��ü�迭 ó�� 
		Book[] bookArr1 = new Book[3];	//Book ��ü�� ������ �迭���� ����
		Book[] bookArr2 = new Book[3];
		
		// ��ü ����
		bookArr1[0] = new Book("�¹���", "������");
		bookArr1[1] = new Book("���̾�", "�츣�� �켼");
		bookArr1[2] = new Book("��Ի���ΰ�?", "���ù�");
		
		for(int i = 0; i < bookArr2.length; i++) {	//�ʱ�ȭ
			bookArr2[i] = new Book();	// ����Ʈ �����ڷ� �����ص�
		}
	
		System.out.println("============= ���� =============");
		for(int i = 0; i < bookArr1.length; i++) {	// ����
			bookArr1[i].showBookInfo();
		}

		// ���� ����
		for(int i = 0; i < bookArr1.length; i++) {	// ����
			bookArr2[i].setBookName(bookArr1[i].getBookName());
			bookArr2[i].setAuthor(bookArr1[i].getAuthor());
		}
		// ���� ����
		bookArr1[0].setAuthor("�ڿϼ�");
		bookArr1[0].setBookName("����");

		System.out.println("============= ���� =============");
		for(int i = 0; i < bookArr1.length; i++) {	// ����
			bookArr1[i].showBookInfo();
		}

		System.out.println("============= �纻 =============");
		for(int i = 0; i < bookArr2.length; i++) {	// �纻
			bookArr2[i].showBookInfo();
		}


	}

}