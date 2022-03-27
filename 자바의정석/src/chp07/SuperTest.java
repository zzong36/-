package chp07;

class Parent{
	int x = 0;
}

class Child extends Parent {
	
	int x = 1;	// 멤버변수가 조상 클래스인 Parent에도 있고 자손 클래스인 Child 클래스에도 있다면 this와 super은 다른 값을 참조하게 된다. 
	
	Child(){
		x = 2;
	}
	
	 int method(int x) {
		 System.out.println("x = " + x);
		 System.out.println("this.x = " + this.x);
		 System.out.println("super.x = " + super.x);
		 return this.x;
	 }
}

public class SuperTest {
	
	public static void main(String[] args) {
		Child c = new Child();
		c.method(3);
		
	}

}
