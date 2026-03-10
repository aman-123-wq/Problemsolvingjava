package student;
import java.util.*;

public class studentgrade {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int grade = 0;
		for(int i=0;i<n;i++) {
			 grade=sc.nextInt();
			 if (grade<38) {
					System.out.println(grade);
					
				}
				else if(grade>=38 && (grade+(5-grade % 5)-grade<3)) {
					System.out.println(grade+(5-grade % 5));
				}
				else {
					System.out.println(grade);
				}
			
		}
		
		sc.close();
		
	}

}
