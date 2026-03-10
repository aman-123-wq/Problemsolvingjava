package student;

import java.util.Scanner;
//kandane algorithm

public class maximumsubarray {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int maxi=arr[0];
		int currsum=arr[0];
		for(int i=1;i<arr.length;i++) {
			currsum=Math.max(arr[i],currsum+arr[i]);
			maxi=Math.max(maxi, currsum);
		}
		System.out.println(maxi);
		sc.close();
		
	}

}
