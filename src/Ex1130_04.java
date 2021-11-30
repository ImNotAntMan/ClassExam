
public class Ex1130_04 {

	public static void main(String[] args) {
		// 이차원 배열 연습
		int[][] arr = {{1, 2, 3}, {4, 5, 6}};	// 2행 3열 생성 및 초기화
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		System.out.println();
		}
	}
}
