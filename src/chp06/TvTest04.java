package chp06;

public class TvTest04 {
	
	public static void main(String args[]) {
		
		Tv[] tvArr = new Tv[3];		//Tv 인스턴스들의 주소를 담을 배열 생성

		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv();	//Tv 인스턴스 생성됨. 
			tvArr[i].channel = i+10;
		}
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel = %d%n", i, tvArr[i].channel);
			
		}
		
	}

}
