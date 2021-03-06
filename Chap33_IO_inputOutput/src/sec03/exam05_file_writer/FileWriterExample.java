package sec03.exam05_file_writer;

import java.io.FileReader;

public class FileWriterExample {

	public static void main(String[] args) throws Exception{
		 //FileReader는 문자 단위로 읽기 때문에 텍스트가 아닌, 그림, 오디오, 비디오 등 
		FileReader fr = new FileReader("/Users/yunsangil/Documents/computing/JAVA/Chap33 Input output stream/src/sec03/exam05_file_writer/FileWriterExample.java");
		int readCharNo;
		char[] cbuf  = new char[100];
		
		//문자열을 읽으면 문자배열에 저장하고 읽은 문자바이트수를 
		while((readCharNo = fr.read(cbuf)) != -1) {
			String data =new String(cbuf, 0, readCharNo);
			System.out.println(data);
		}
		fr.close();
	}
}
