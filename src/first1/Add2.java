package first1;

import java.util.Scanner;

public class Add2 {
	public static void main(String arge[]) {
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int sum;
		System.out.print("ù��° ���ڸ� �Է��ϼ��� : ");
		x = input.nextInt();
		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
		y = input.nextInt();
		sum = x+y;
		System.out.println(sum);
	}
}
