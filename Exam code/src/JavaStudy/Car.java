package JavaStudy;

public class Car {
	// type fieldName
	
	String name;
	int number;
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car() {
		this("�̸�����", 0);
	}
	
	public Car(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	public void run() {
		System.out.println("�޸���");
	}
}
