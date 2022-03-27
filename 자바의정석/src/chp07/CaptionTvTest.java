package chp07;

class Tv{
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
	
}

class CaptionTv extends Tv{		// 자막기능 추가
	boolean caption;
	void displayCaption(String text) {
		if(caption) {
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	
	public static void main(String[] args) {
		
		CaptionTv ctv = new CaptionTv();
		
		ctv.channel = 10;
		ctv.channelUp();
		System.out.println(ctv.channel);
//		ctv.displayCaption("자막 설정");
		ctv.caption = true;
		ctv.displayCaption("자막이 설정되었습니다");
		
		
		
	}

}
