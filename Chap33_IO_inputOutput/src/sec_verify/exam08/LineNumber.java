package sec_verify.exam08;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class LineNumber{

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		BufferedReader br;
		String input;
		int i=1;
		
		System.out.println("텍스트 파일 이름을 입력하세요>>");
		input = scan.nextLine();
		
		br = new BufferedReader(new FileReader(input));
		
		while((input = br.readLine()) != null) {
			System.out.println(i+" : " + input);
			i++;
		}
		scan.close();
		br.close();
	}
}
