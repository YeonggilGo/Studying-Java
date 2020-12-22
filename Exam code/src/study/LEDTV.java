package study;

public class LEDTV implements TV {
	public void turnOn() {
		System.out.println("�Ѵ�");
	}

	public void turnOff() {
		System.out.println("����");
	}

	public void changeVolume(int volume) {
		System.out.println("������ �ٲٴ�");
	}

	public void changeChannel(int channel) {
		System.out.println("ä���� �ٲٴ�");
	}

}
