package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Ex03 {
	static URL url = null;
	static URLConnection conn = null;
	public static void main(String[] args) {
		try {
			url = new URL("http://localhost:8080/list");
			conn = url.openConnection(); //해당 url에서 페이지 정보를 가져오기 위해서 URLConnection을 사용
			
			conn.setDoOutput(true);
			String firstName = "홍";
			String lastName = "길동";
			
			OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream(),"utf-8");
			
			String encFn = URLEncoder.encode(firstName,"UTF-8");
			String encln = URLEncoder.encode(lastName,"UTF-8");
			
			String str = URLDecoder.decode("깨진문자열","utf-8");
			String parameters= "Firstname="+encFn+"&Lastname="+encln;
//			System.out.println("@@@@@@@@"+parameters);
			writer.write(parameters);
			writer.flush();
			
			System.out.println("contentType: "+conn.getContentType()); // 미디어타입을 반환
			System.out.println("content-encoding: "+conn.getContentEncoding()); //인코딩되지않은채로 콘텐츠가 전송될 경우 null을 반환
			System.out.println("content-length: "+conn.getContentLength());//길이반환 헤더가 없는 경우 -1 반환
			System.out.println("Date:"+conn.getDate());//언제 문서가 전송되었는지 반환 그리니치 표준시 
			System.out.println("Last-Modified: "+conn.getLastModified()); //문서가 마지막으로 변경된 날짜 반환 HTTP헤더에 Last-Modified가 없는경우 0 반환
			System.out.println("Expires: "+conn.getExpiration());//서버 기준의 만료일 반환
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
			String line;
			while((line = reader.readLine())!=null) {
				System.out.println(line);
			}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}