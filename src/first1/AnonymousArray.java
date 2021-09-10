package first1;

public class AnonymousArray {
public static void main(String[] args) {
	System.out.println("숫자들의 합 : " + 
						sum(new int[] {1,2,3,4 ,5}));
}
public static int sum(int[] num) {
	int tot = 0;
	for (int i = 0; i < num.length; i++) {
		tot += num[i];
	}
	return tot;
	
}
}
