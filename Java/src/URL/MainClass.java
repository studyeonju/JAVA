package URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {
        // TODO Auto-generated method stub
        URL address = null;
        String responseData = "";
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input the name");
        int bno = sc.nextInt();
        
        try {
            address = new URL("http://localhost:8080/detail?bno="+bno);
            URLConnection urlcon = address.openConnection();
            InputStream is = urlcon.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String buff;
            br = new BufferedReader(new InputStreamReader(urlcon.getInputStream(), "UTF-8"));
            StringBuffer sb  = new StringBuffer();
			while ((responseData = br.readLine()) != null) {
				sb.append(responseData); // StringBuffer에 응답받은 데이터 순차적으로 저장 실시
			}

             System.out.println(sb);
            
        } catch (MalformedURLException e) {
            System.out.println("잘못된 URL입니다.");
        }
        
    }
}
