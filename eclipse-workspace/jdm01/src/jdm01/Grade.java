package jdm01;
import java.util.Scanner;

public class Grade { //Grade의 변수 선언
	 private int math;
	 private int science;
	 private int english;
	 public int average() { //평균을 구하는 함수
		 return (math+science+english)/3;
	 }
	public Grade(int math, int science, int english) {
		this.math = math;
		this.science = science;		
		this.english = english;
	}	
	public static void main(String [] args) { //입력된 값을 계산하여 출력하는 함수
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("수학, 과학, 영어 순으로 3개의 점수 입력>>");
		int math = scanner.nextInt();
		int science = scanner.nextInt();
		int english = scanner.nextInt();
		Grade me = new Grade(math, science, english);
		System.out.println("평균은 " + me.average());
		
		scanner.close();
	}
}