package JavaStudy;

public class Myclass {
	public void method1() {
		System.out.println("m1이 실행됨");
	}

	public void method2(int x) {
		System.out.println(x + "를 이용한 m2");
	}

	public int method3() {
		System.out.println("m3");
		return 1;
	}

	public void method4(int x, int y) {
		System.out.println(x + y + "m4");
	}

	public int method5(int x) {
		System.out.println(x + "m5");
		return x;
	}
}
