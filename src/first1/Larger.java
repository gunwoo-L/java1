package first1;
import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		int x,y,mex;
		
		Scanner input = new Scanner(System.in);
		System.out.println("ù��° ��");
		x= input.nextInt();
		System.out.println("�ι�° ��");
		y= input.nextInt();
		
		if(x>y) {
			mex= x;
		}else {
			mex = y;
		}
		System.out.println("ū��" + mex);
	}

}
