
public interface Calc {
	double PI = 3.14;
	int ERROR = -99999999;

	// 인터페이스에서는 메소드의 내용을 구현하지 않음.
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
}
