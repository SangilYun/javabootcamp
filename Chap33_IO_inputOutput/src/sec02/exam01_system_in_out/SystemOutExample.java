package sec02.exam01_system_in_out;

import java.io.OutputStream;

public class SystemOutExample {

	public static void main(String[] args) throws Exception{
		 //Printstream(System.out)은 OutputStream의 자손클래스이므로 
		//대입이 가능하다. 
		OutputStream os = System.out;
		//아스키코드표를 참고해보도록 하자. : 0~9
		for(byte b=48; b<58; b++) {
			System.out.println("아스키코드 write() 후 출력된 문자값 : ");
			os.write(b);
			System.out.println();
		}
		os.write(13); //줄바꿈을 위해서 아스키코드값을 write했다. 
		for(byte b=97; b<123; b++) {  //a~z
			System.out.println("아스키코드 write()후 출력된 문자값 : ");
			os.write(b);
			System.out.println();
		}
		os.write(13);
		String hangul = "학생";
		//String에서 바이트배열을 얻는다.
		byte[] hangulBytes = hangul.getBytes();
		os.write(hangulBytes); //한번에 문자열을 출력시킨다. 
		os.flush();
		os.close();
	}
}
