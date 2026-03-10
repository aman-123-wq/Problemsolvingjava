package hackerrankcomparator;
import java.util.*;
public class anagram {
public static boolean isAnagram(String s1, String s2) {
        
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int index = s2.indexOf(ch);

            if (index == -1) {
                return false;
            }

            s2 = s2.substring(0, index) + s2.substring(index + 1);
        }

        return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		System.out.println(isAnagram(a,b));
		sc.close();
		
	}

}
