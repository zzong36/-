package chp07.deck;

class Card {
	
	static final int KIND_MAX = 4; // 카드 무늬의 수
	static final int NUM_MAX = 13; // 무늬별 카드 수
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	
	int kind;
	int number;
	
	Card(){
		this (SPADE, 1);
	}
	
	Card(int kind, int number){
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String [] kinds = {" ", "CLOVER", "HEART", "DIAMOND", "SPADE"};
		String numbers = "0123456789XJQK";
		return "kind : " + kinds[this.kind] + ", number : " + numbers.charAt(this.number);
	}


}
