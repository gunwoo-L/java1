package first1;

import java.util.Scanner;

public class DaysInMonth {
public static void main(String[] args) {
	Scanner sct = new Scanner(System.in);
	int month;
	int days = 0;
	int year;
	
	System.out.println("�⵵�� �Է��ϼ���");
	year = sct.nextInt();
	System.out.println("���� �Է��ϼ���");
	month = sct.nextInt();
	switch (month) {
	case 4:
	case 6:
	case 9:
	case 11:
		days = 30;
		break;
	case 2:
		if(year%4==0&&year%100!=0||year%400 == 0) {
			days = 29;
		}else {days = 28;}
		
	default:
		days = 31;
		break;
	}
	System.out.println(year + "��" +days + "�� �Դϴ�.");
}
}
