package JavaStudy;

public class ForeachExam {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			int value = arr[i];

		}

		for (int val : arr) {
			System.out.println(val);
		}
	}

}
