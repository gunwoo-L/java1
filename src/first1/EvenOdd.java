package first1;
import java.util.Scanner;

public class EvenOdd {
public static void main(String[] args) {
	int number;
	Scanner input = new Scanner(System.in);
	System.out.println("�Է�");
	number = input.nextInt();
	if(number % 2==0) 
	{
		System.out.println("¦��");
	}
	else {
		System.out.println("Ȧ��");
	}
	System.out.println("����");
}
}
