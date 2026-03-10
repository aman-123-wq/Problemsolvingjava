package task14;

import java.util.Scanner;

public class solution {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			String type=sc.next();
			int id=sc.nextInt();
			String name=sc.next();
			double baserent = sc.nextDouble();
			
			if(type.equals("Car")) {
				double seats=sc.nextDouble();
				Car c=new Car(id,name, baserent,seats);
				System.out.println(c.calculaterent());
				
			}
			else if(type.equals("Bike")) {
				double enginecapacity=sc.nextDouble();
				Bike b=new Bike(id,name,baserent,enginecapacity);
				System.out.println(b.calculaterent());
			}
			
			
		
		}
		sc.close();
		
		
	}

}
