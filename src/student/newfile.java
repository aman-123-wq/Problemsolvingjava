package student;

import java.util.Scanner;

public class newfile {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String a=sc.nextLine();
		String b=a.substring(5);
		System.out.println(b);
		sc.close();
	}

}
