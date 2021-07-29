import java.util.*;
public class ConcatenateStringWhenSubstringOccurs {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s1 = scan.next();
		System.out.println("Enter the substring: ");
		String s2 = scan.next();
		StringBuffer a = new StringBuffer();
		while (s1.indexOf(s2)!=-1)
		{
			int index = s1.indexOf(s2);
			if(index ==0 && index+s2.length()<s1.length()-1)
			{
				a.append(s1.charAt(index+s2.length()));
				s1 = s1.replace(s2, "");
				continue;
			}
			if(index -1 ==0 && index+s2.length()>=s1.length())
			{
				a.append(s1.charAt(index -1));
				s1=s1.replace(s2, "");
				continue;
			}
			if(index +s2.length()<s1.length() -1 && index-1>=0)
			{
				a.append(s1.charAt(index-1));
				a.append(s1.charAt(index+ s2.length()));
				s1 = s1.replace(s2, "");
			}
		}
		System.out.println(a);
	}

}
