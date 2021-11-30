
public class Ex1130_01 {

	public static void main(String[] args) {
		// �迭 ���� ����(shallow copy)
		int[] array1 = {10, 20, 30, 40, 50};
		int[] array2 = {1,2,3,4,5};
		
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		//�⺻Ÿ���� ����� ������(int, double, float, char, ........)
		System.arraycopy(array1, 0, array2, 1, 4);
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		array1[2] = 300;	// �迭1 ����
		// �迭1 Ȯ��(������)
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		// �迭2 ����Ʈ�ϸ� ��ȭ ����.
		for(int i = 0; i < array1.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		// ��ü�迭 ó�� deep copy ����
		Book[] bookArr1 = new Book[3];	//Book ��ü�� ������ �迭���� ����
		Book[] bookArr2 = new Book[3];
		
		Book aaa;	//����
		aaa = new Book("aaa", "bbb");	//����
		
		// ��ü ����
		bookArr1[0] = new Book("�¹���", "������");
		bookArr1[1] = new Book("���̾�", "�츣�� �켼");
		bookArr1[2] = new Book("��Ի���ΰ�?", "���ù�");
		
		System.out.println("============= ���� =============");
		for(int i = 0; i < bookArr1.length; i++) {	// ����
			bookArr1[i].showBookInfo();
		}
		System.arraycopy(bookArr1, 0, bookArr2, 0, 3);	//���� ����(shallow copy)
		System.out.println("============= �纻 =============");
		for(int i = 0; i < bookArr2.length; i++) {	// �纻
			bookArr2[i].showBookInfo();
		}
		//���� ����
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