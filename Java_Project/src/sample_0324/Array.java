package sample_0324;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = new int[10]; // 배열의 수를 알려주는 것.
		int[] array2 = { 11, 3, 4, 5, 6, 8 }; // 규칙이 없으면 깡그리 직접 써준다.
		// System.out.println(array[1]);
		for (int i = 0; i < 10; i++) {
			array[i] = (i + 1) * 10;
			System.out.println(i + " " + array[i]);
		}
		array2[0] = array2[2] + array2[4]; // 배열2의 2와 배열2의 4를 더해서 배열2의 0에 집어넣어라.
	}

}
