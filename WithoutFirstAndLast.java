import java.util.*;
public class WithoutFirstAndLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.nextLine();
		String a= " ";
		a=s1.substring(1, s1.length()-1);
		System.out.println(a);
	}

}
