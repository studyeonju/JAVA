package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {
	static URL url = null;
	static URLConnection conn = null;
	public static void main(String[] args) {
		try {
			url = new URL("http://www.naver.com/"); //객체생성
			conn = url.openConnection(); //해당 url에 대한 URLConnection객체를 얻기 위해 URL객체의 openConnection() 사용
			InputStream in = conn.getInputStream(); // inputStream 값 반환 
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			char[] buff = new char[512];
			int len = -1;
			while((len = br.read(buff))!=-1) {
				System.out.println(new String(buff,0,len));
			}
			br.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
