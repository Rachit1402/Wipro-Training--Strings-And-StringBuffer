import java.util.*;
public class RepetitionsFromLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.nextLine();
		System.out.println("Enter the number: ");
		int n = scan.nextInt();
		String a =" ";
		for(int i=0;i<n;i++)
		{
			a = s1.substring(n-1);
			System.out.print(a);
		}
	}

}
