package sec_verify.exam05;

import java.util.ArrayList;

public class Score {
	ArrayList<Student> record = new ArrayList<>();
	int koreanTotal = 0;
	int mathTotal = 0;
	int englishTotal = 0;
	
	public void add(Student st) {
		this.record.add(st);
	}
	
	public void setTotal() {
		for(Student each : record) {
			koreanTotal += each.korScore;
			mathTotal += each.matScore;
			englishTotal += each.engScore;
		}
	}

	public int getKoreanTotal() {
		return koreanTotal;
	}

	public int getMathTotal() {
		return mathTotal;
	}

	public int getEnglishTotal() {
		return englishTotal;
	}
	
	public void display() {
		setTotal();
		System.out.format("%-5s%-5s%-5s%-5s%-5s%-5s\n","이름","번호","국어","수학","영어","총점");
		System.out.println("======================================");
		for(Student each : record) {
			System.out.println(each);
		}
		System.out.println("======================================");
		System.out.format("%3d명 총점 :%6d%6d%6d%6d",
				record.size(), koreanTotal,mathTotal,englishTotal, koreanTotal+mathTotal+englishTotal);
	}
}
