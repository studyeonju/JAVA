package Try;

import java.io.FileWriter;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		//try의 괄호안에 close가 필요한 클래스를 인스턴스화 시키는 코드를 넣는다.
		try (FileWriter f = new FileWriter("data.txt")) {
			f.write("Hello");
			//f.close(); 내부적으로 close된다.
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}













