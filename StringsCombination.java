import java.util.*;
public class StringsCombination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1 = scan.nextLine();
		System.out.println("Enter the second string: ");
		String s2 = scan.nextLine();
		StringBuffer s3 = new StringBuffer();	//created a buffer string so as to have a mutable string in order to change its length as per our requirement.
		for (int i=0;i<s1.length();i++)
		{
			s3.append(s1.charAt(i)).append(s2.charAt(i));	//appending the values in the buffer string one after another.
		}
		System.out.println(s3);
	}

}
