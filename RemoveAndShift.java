import java.util.*;
public class RemoveAndShift {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string with '*': ");
		String s1 = scan.nextLine();
		String[] s2 = s1.split(".[\\*]+.");
		
		StringBuffer a = new StringBuffer();
		for (String x: s2)
		{
			a.append(x);
		}
		System.out.println(a);
	}

}
