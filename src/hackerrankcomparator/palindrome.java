package hackerrankcomparator;
import java.util.*;
public class palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String reversed="";
		for(int i=a.length()-1;i>=0;i--) {
			reversed=reversed +a.charAt(i);
		}
		if(a.equals(reversed)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not a palindrome");
		}
		sc.close();
		
	}

}
