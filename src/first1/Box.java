package first1;

import java.util.*;

public class Box {
	public static void main(String[] args) {
		double w, h, area, perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�簢���� ���θ� �Է��ϼ��� ");
		w= input.nextInt();
		System.out.println("�簢���� ���θ� �Է��ϼ��� ");
		h= input.nextInt();
		area = w * h;
		perimeter = 2.0 * (w + h);
		
		System.out.println("�簢���� ���̴� " + area);
		System.out.println("�簢���� �ѷ��� " + perimeter);
	}

}
