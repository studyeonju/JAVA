package URL;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

public class Ex07 {
	public static void main(String[] args) throws IOException {
		sendPosJson();
//		sendGetJson();
	}

	private static void sendGetJson() throws IOException {
		URL url = new URL("https://webhook.site/dab0d188-0f14-413b-a86c-25f7eca3db80");
		HttpURLConnection conn = (HttpURLConnection) url.openConnection();
		conn.setRequestMethod("GET");
		conn.setRequestProperty("Content-Type", "application/json");
		conn.setRequestProperty("Accept", "application/json");
		conn.setRequestProperty("id", "faker");
		conn.setRequestProperty("game", "lol");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"utf-8"));
		StringBuilder response = new StringBuilder();
		String responseLine = null;
		while((responseLine=br.readLine())!=null) {
			response.append(responseLine.trim());
			
		}
		System.out.println(response.toString());
		System.out.println("응답코드"+conn.getResponseCode());
	}

	private static void sendPosJson() throws IOException {
	    
        URL url = new URL("http://localhost:8080/post");
        
        // HTTP 접속 구하기
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        
        // 리퀘스트 메소드를 POST로 설정
        conn.setRequestMethod("POST");
        
        // 연결된 connection 에서 출력도 하도록 설정 
        conn.setDoOutput(true);
    
        // 요청 파라미터 출력   
        // - 파라미터는 쿼리 문자열의 형식으로 지정 (ex) 이름=값&이름=값 형식&...
        // - 파라미터의 값으로 한국어 등을 송신하는 경우는 URL 인코딩을 해야 함.
        try (OutputStream out = conn.getOutputStream()) {
            out.write("id=javaking".getBytes());
            out.write("&".getBytes());
            out.write(("name=" + URLEncoder.encode("자바킹","UTF-8")).getBytes());
        }
                
        // 응답 내용(BODY) 구하기
        try (InputStream in = conn.getInputStream();
                ByteArrayOutputStream out = new ByteArrayOutputStream()) {
            byte[] buf = new byte[1024 * 8];
            int length = 0;
            while ((length = in.read(buf)) != -1) {
                out.write(buf, 0, length);
            }
            System.out.println(new String(out.toByteArray(), "UTF-8"));
        }
        // 접속 해제
        conn.disconnect();
	}
}
