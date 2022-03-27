package chp06;

class Car{
	String color;
	String gearType;
	int door;
	
	Car(){
		// this("white", "auto", 4);
	}
	
	Car(String color){
		this(color, "auto", 4);
	}
	
	Car(String color, String gearType){
		this(color, gearType, 4);
	}
	
	Car(String color, String gearType, int door){
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
}

public class CarTest2 {
	
	public static void main(String args[]) {
	Car c1 = new Car();
	Car c2 = new Car("blue");
	Car c3 = new Car("red", "autoto");
	Car c4 = new Car("yellow", "autototo", 3);
	
	System.out.printf("c1의 color: %s geartype: %s door: %d%n", c1.color, c1.gearType, c1.door);
	System.out.printf("c2의 color: %s geartype: %s door: %d%n", c2.color, c2.gearType, c2.door);
	System.out.printf("c3의 color: %s geartype: %s door: %d%n", c3.color, c3.gearType, c3.door);
	
	
	}

}
