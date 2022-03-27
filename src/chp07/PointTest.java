package chp07;

class Point1{
	int x;
	int y;

	Point1(){
		
	}
	
	Point1(int x, int y){
		this.x = x;
		this.y = y;		
	}
	
	String getLocation() {
		return "x : " + x + ", y : " + y;
	}
}

class Point3D extends Point1{
	int z;
	
	Point3D(int x, int y, int z){
//		super();	// 자동으로 넣어준다
		this.x = x;
		this.y = y;
		this.z = z;
	}

	String getLocation() {
		return "x : " + x + ", y : " + y  + ",z" + z;
	}
	
	
}

public class PointTest {

}
