package first1;

import java.util.Calendar;
import java.util.Date;


public class Welcome {
public static void main(String[] args) {
//	Date date = new Date();
//	int currentHour = date.getHours(); �� �̻� �Ⱦ��� ���
	Calendar cal = Calendar.getInstance();
	int currentHour = cal.get(Calendar.HOUR_OF_DAY); //�ٲ� �Է� ���
	System.out.println("����ð�" + cal);
	if(currentHour < 11) {
		System.out.println("Good morning");
	} else if (currentHour < 15) {
		System.out.println("Good afternoon");
	}else if (currentHour < 20) {
		System.out.println("Good evening");
	}else {
		System.out.println("Good night");
	}
}
}
