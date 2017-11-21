package jdm01;
import java.util.Scanner;
class Circle { 
	private double x,y;
	private int radius;
	public Circle (double x, double y, int radius) { //Circle 변수를 선언
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	public int getRadius() {return radius;}
	public void show() {
		System.out.println("(" + x + "," + y + ")"+ radius);
	}
}
public class CircleManager {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Circle c [] = new Circle [3]; //3개의 배열 사용
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius >>");
			double x = scanner.nextDouble();
			double y = scanner.nextDouble();	 
			int radius = scanner.nextInt();
			c[i] = new Circle(x,y,radius);
		}
		for(int i=0; i<c.length; i++) c[i].show(); 
		scanner.close();
		int temp=c[0].getRadius(); //첫 비교 대상 
	    for(int i=0;i<c.length;i++){ 
		if(c[i].getRadius()>temp){//첫 대상보다 큰지 비교 
		          temp=c[i].getRadius(); //크다면 temp로 받는다
		       } 
		    } 
		    System.out.println("가장 면적이 큰 원은 "+ temp); 
	}
}