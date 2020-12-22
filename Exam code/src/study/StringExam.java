package study;

public class StringExam {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		
		String str3 = new String("hello");
		String str4 = new String("hello");
		
		if (str1 == str2) {
			System.out.println("str1�� str2�� ���� ref�Դϴ�");
		}
		if (str1 == str3) {
			System.out.println("str1�� str3�� ���� ref�Դϴ�");
		}
		if (str3 == str4) {
			System.out.println("str3�� str4�� ���� ref�Դϴ�");
		}
		
		System.out.println(str1.substring(3));
	}

}
