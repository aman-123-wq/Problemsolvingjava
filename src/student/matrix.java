package student;
import java.util.*;

public class matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int arr[][] = new int[n][n];
        int res[][] = new int[n][n];

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    res[i][j] += arr[i][k] * arr[k][j];
                }
            }
        }

        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}