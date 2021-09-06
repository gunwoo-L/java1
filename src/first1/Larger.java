package first1;
import java.util.Scanner;

public class Larger {
	public static void main(String[] args) {
		int x,y,mex;
		
		Scanner input = new Scanner(System.in);
		System.out.println("첫번째 수");
		x= input.nextInt();
		System.out.println("두번째 수");
		y= input.nextInt();
		
		if(x>y) {
			mex= x;
		}else {
			mex = y;
		}
		System.out.println("큰수" + mex);
	}

}
