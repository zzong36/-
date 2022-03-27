package chp07.poly;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스점수는 제품가격의 10%
	}
}
