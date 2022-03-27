package chp07.poly;

class Tv extends Product{
	Tv(){
		super(100); // 조상클래스의 생성자 Product(int price)를 호출해 Tv가격을 100으로 한다. 
	}
	public String toString() {
		return "TV";
	}
}
class Computer extends Product{
	Computer(){
		super(200); 
	}
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;	// return문은 현재 실행중인 메서드를 종료하고 호출한 메서드로 되돌아간다.
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "을/를 구입하셨습니다.");
	}
}

