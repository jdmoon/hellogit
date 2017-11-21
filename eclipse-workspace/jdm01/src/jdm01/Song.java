package jdm01;

public class Song { //Song의 변수 선언
	private String title;
	private String artist;
	private int year;
	private String country;
	
	public Song() { }
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}

	public void show() { //this로 접근한 변수들을 출력
		System.out.print(year + "년 ");
		System.out.print(country + "국적의 ");
		System.out.print(artist + "가 부른 ");
		System.out.println(title);
	}
	public static void main(String[] args) { //Song 함수에 정보를 저장
		Song myFavorite = new Song("Dancing Queen", "ABBA", 1978, "스웨덴");
		myFavorite.show();
	}

}