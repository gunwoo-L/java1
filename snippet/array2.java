package snippet;

import java.util.Scanner;

public class array2 {
public static void main(String[] args) {
	final int std = 5;
	int tot = 0;
	Scanner scan = new Scanner(System.in);
	int[]scores = new int [std];
	
	for (int i = 0; i < scores.length; i++) {
		System.out.print((i+1)+"번 학생의 성적을 입력하세요.");
		scores[i] = scan.nextInt();
	}
	for (int i = 0; i < scores.length; i++) {
		tot += scores[i];
	}
	System.out.println("평균성적은" + (double)tot/ std +"입니다.");
}
}
