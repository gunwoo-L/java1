package first1;

import java.util.Iterator;
import java.util.Scanner;

public class GetMin {
public static void main(String[] args) {
	//int s[] = {12,3,19,6,18,8,12,4,1,19};
	
	int s[] = new int [10];
	Scanner scn = new Scanner(System.in);
	int minimm , maxmum;
    for (int i = 0; i < s.length; i++) {
		System.out.print("10����" + (i+1) + "��° �� �Է� : ");
		s[i] = scn.nextInt();
	}
	
	minimm = s[0];
	maxmum = s[0];
	for (int i = 0; i < s.length; i++) {
		if (s[i]<minimm)
			minimm = s[i];
		if (s[i]> maxmum)
		maxmum = s[i];
	}
	System.out.print("�ּҰ��� " + minimm + "�ִ밪�� " + maxmum);
	
}
}
