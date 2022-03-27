package chp07.time;

class Time {
private int hour, minute, second;
	
	Time(int hour, int minute, int second){
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}
	
	public int getHour() { // 이것의 존재의의는 뭘까?
		return hour;
	}
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23) return; // return의 의미는?
		this.hour = hour;
	}
	
	public int getMinute() {
		return minute;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59) return;
		this.minute = minute;
	}
	public int getSecond() {
		return second;
	}
	
	public void setSecond(int second) {
		if(second < 0 || second > 59) return; 
		this.second = second;
	}
	
	public String toString() { // 오버라이드 개념인가?
		return hour + ":" + minute + ":" + second;
	}
	
	
}
