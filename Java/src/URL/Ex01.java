package URL;

import java.io.IOException;
import java.net.URL;

public class Ex01 {
	public static void main(String[] args) throws IOException {
		//객체 생성
		URL url = new URL("http://localhost:8080/list");
		
		
		//경로명 반환
		System.out.println("경로명:"+url.getPath());
		//프로토콜명 반환
		System.out.println("프로토콜:"+url.getProtocol());
		//포트번호 반환 
		System.out.println("포트번호:"+url.getPort());
		//호스트명 반환
		System.out.println("호스트:"+url.getHost());
		//파일명 반환 
		System.out.println("파일:"+url.getFile());
		//쿼리 반환 
		System.out.println("쿼리:"+url.getQuery());
		//참조반환
		System.out.println("참조:"+url.getRef());
		//url의 Content객체를 반환한다.
		System.out.println("사용자정보"+url.getContent());
		//url 문자열로 변환하여 반환  
		System.out.println("url:"+url.toExternalForm());
		//url 기본포트를 반환
		System.out.println("기본포트:"+url.getDefaultPort());
		//url connection을 얻는다
		System.out.println("url connection:"+url.openConnection());
		//사용자 정보를 반환
		System.out.println("사용자정보:"+url.getUserInfo());
	}
	
}
