package student;

import java.util.Scanner;

public class timeconversion {
	public static String timeConversion(String s) {
		return s;
		
	}
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=a.substring(0,5);
		String c=a.substring(5);
		int hour=Integer.parseInt(b.split(":")[0]);
		if(c.equals("PM")&& hour!=12) {
			hour=hour+12;
		}
		else if(c.equals("AM")&& hour==12) {
			hour=0;
		}
		System.out.println("Time: " + hour + ":" + b.split(":")[1]);
		sc.close();
	}

}
