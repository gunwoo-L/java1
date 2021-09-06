package first1;
import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	int number;
	Scanner input = new Scanner(System.in);
	System.out.println("ÀÔ·Â");
	number = input.nextInt();
	if(number % 2==0) 
	{
		System.out.println("Â¦¼ö");
	}
	else {
		System.out.println("È¦¼ö");
	}
	System.out.println("Á¾·á");
}
}
