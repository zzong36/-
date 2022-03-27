package chp06;

class MyMath{
	
	int add(int a, int b) {
		return a + b;
	}
	int subtract (int a, int b) {
		return a - b;
	}
	int multiply(int a, int b) {
		return a * b;
	}
	int divide(int a, int b) {
		return a/b;
	}
	
}

public class MyMathTest {
	
	public static void main(String args[]) {
		
		MyMath mm = new MyMath();
		int result1 = mm.add(1, 5);
		int result2 = mm.subtract(5, 1);
		int result3 = mm.divide(6, 3);
		int result4 = mm.multiply(1, 5);
		
		System.out.println("add(1,5) = " + result1);
		System.out.println("subtract(5,1) = " + result2);
		System.out.println("divide(6,3) = " + result3);
		System.out.println("multiply(1,5) = " + result4);
				
		
	}
	

}
