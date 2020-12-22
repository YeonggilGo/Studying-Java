package study;

public class LEDTVExam {

	public static void main(String[] args) {
		TV tv = new LEDTV();
		
		tv.turnOff();
		tv.turnOn();
		tv.changeChannel(15);
		tv.changeVolume(3);
	}

}
