package first1;

import java.util.*;

public class Box {
	public static void main(String[] args) {
		double w, h, area, perimeter;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("사각형의 가로를 입력하세요 ");
		w= input.nextInt();
		System.out.println("사각형의 세로를 입력하세요 ");
		h= input.nextInt();
		area = w * h;
		perimeter = 2.0 * (w + h);
		
		System.out.println("사각형의 넓이는 " + area);
		System.out.println("사각형의 둘레는 " + perimeter);
	}

}
