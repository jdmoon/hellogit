package c1;
import java.util.*;

public class Grade {
	public static void main(String[] args) {
		ArrayList<Character> a = new ArrayList<Character>();
		double stgrade = 0.0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("6개 학점을 입력>>");
		double sum = 0;
		
		for (int i = 0; i < 6; i++) { //for문을 이용하여 학점을 입력한다
			String s =scanner.next();
			char ch = s.charAt(0);
			if(ch == 'A' || ch =='B' || ch == 'C'|| ch =='D' || ch == 'F') {
				a.add(ch);
			}
			else {
				System.out.println("입력값이 잘못 되었습니다. ");
			}
		}
		for ( int i =0; i< a.size(); i++) {
			char ch = a.get(i);
			
			switch (ch) {
			case 'A':
				stgrade = 4.0;
				break;
			case 'B':
				stgrade = 3.0;
				break;
			case 'C':
				stgrade = 2.0;
				break;
			case 'D':
				stgrade = 1.0;
				break;
			case 'F':
				stgrade = 0.0;
				break;
			}
			sum += stgrade;
		}
		double avg = sum/6; //평균을 계산하는 avg
		System.out.println(avg);
	}

}
