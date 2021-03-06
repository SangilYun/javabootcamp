package sec03.exam02_file_input_stream;

import java.io.FileInputStream;

public class FileInputStreamExample {

	public static void main(String[] args) {
		 try {
			 //FileInputStream fis = new FileInputStream("~~");
			 //\는 이스케이프 문자
			 //현재 소스코드를 콘솔에 출력해보는 프로그램이다. 
			 FileInputStream fis = new FileInputStream("/Users/yunsangil/Documents/computing/JAVA/Chap33 Input output stream/src/sec03/exam02_file_input_stream/FileInputStreamExample.java");
			 
			 int data;
			 int i=0;
			 //한 바이트씩 읽는다.
			 while((data = fis.read()) != -1) {
				 //콘솔 출력(원래 System.out.println()을 해야하나, 
				 //어차피 출력스트림이므로 write()써도 무방하다.)
				 System.out.write(data);
				 
				 //콘솔 출력 System.out.print()사용, 한글은 2바이트이기 때문에
				 //깨진다. 그렇기 때문에 바이트배열로 하는 것이 현명하다. 
				 //System.out.print((char)data);
				 i++;
			 }
			 System.out.println("루핑 수 : " + i);
			 fis.close(); // 자원 해제 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
	}
}