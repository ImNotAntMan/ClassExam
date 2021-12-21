
public class Calculator implements Calc {
	public int add(int num1, int num2) {
		return num1 + num2;
	}
	
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	public int times(int num1, int num2) {
		return num1 * num2;
	}
	
	public int divide(int num1, int num2) {
		if(num2 == 0) {
			return Calc.ERROR;
		} else {
			return num1/num2;
		}
	}
}
