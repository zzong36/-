package chp06;

class Tv{
	
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
	
	void channelUp() {++channel;}
	
	void channelDown() {--channel;}
	
}

public class TVtest {
	
	public static void main(String args[]) {
		
		Tv t = new Tv(); 	// Tv 인스턴스를 생성한다.
		t.channel = 7; 		// Tv 인스턴스의 멤버변수 channel의 값을 7로 한다.
		t.channelDown(); 	//Tv 인스턴스의 메서드 channelDown()을 호출한다.
		System.out.printf("현재의 채널은 %d 채널입니다.", t.channel);
		
		
		
	}

}
