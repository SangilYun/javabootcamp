package sec04.exam02_outputstreamwriter;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterExample {

	public static void main(String[] args) throws Exception{
		 
		//문자 파일에 저장하는 FileOutputstream을 생성했지만 바이트기반이다. 따라서 아래와 같이 
		//문자를 바이트로 변환하는 InputStreamWriter을 보조스트림으로 연결해주면 된다.
		OutputStream fos = new FileOutputStream("");
		Writer writer = new OutputStreamWriter(fos); //보조스트림 연결
		
		String data = "문자데이터를 보조출력스트림으로 보내어 바이트기반으로 변환되어 저장됨.";
		writer.write(data); //보조스트림 즉, 문자기반스트림인 OutputStreamWriter로 data를 보내 바이트기반으로 변
		writer.flush(); //버퍼 강제 비우기 
		writer.close(); //자원 해
		fos.close();
		System.out.println("파일 저장이 끝났습니다.");
	}
}
