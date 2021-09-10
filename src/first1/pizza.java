package first1;

public class pizza {
public static void main(String[] args) {
	//String[] top = {"Pepperoni", "Mushroom","Onions","Sausage","Bacon"};
	String[] top = new String[5];
	top[0] = "Pepperoni";
	top[1] = "Mushroom";
	top[2] = "Onions";
	top[3] = "Sausage";
	top[4] = "Bacon";
	for (int i = 0; i < top.length; i++) {
		System.out.print(top[i] + " ");
	}
}
}
