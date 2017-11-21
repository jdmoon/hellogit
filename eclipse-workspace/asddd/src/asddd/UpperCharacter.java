package asddd;
import java.io.*;

public class UpperCharacter {

	public static void main(String[] args) {
		try {
			File f = new File("c:\\windows\\system.ini"); //경로를 지정한다.
			FileReader fin = new FileReader(f);
			int c;
			while((c=fin.read()) != -1) { //소문자를 대문자로 바꾸는 while
				char a = (char)c;
				if(Character.isLowerCase(a))
					a = Character.toUpperCase(a);
				System.out.print((char)a); //대문자 출력
			}
			fin.close();
		}
		catch(IOException e) {
			System.out.println("파일 읽기 오류");
		}

	}

}
