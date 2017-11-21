package jdm01;

public class TV { //TV의 변수 선언
	 String manufacturer;
	 int year;
	 int size;
		
	public TV(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year;		
		this.size = size;
	}
	
	public void show() {
		System.out.print(this.manufacturer + "에서 만든 "+this.year + "년형 "+this.size + "인치 TV");
	}//저장된 변수값을 출력
	
	public static void main(String [] args) {
		TV myTV = new TV("LG", 2017, 32); // LG에서 만든 2017년 65인치
		myTV.show();
	}
}