package ex2;

import java.util.Scanner;

public class Java23 {
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[][] arr = new int[n][n];
		int cnt = 1;
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n ; j++)
			{
				if(i%2==0)
				{
					arr[i][j] = cnt;
					cnt++;					
				}
				else if(i%2==1) 
				{
					arr[i][n-j-1]=cnt;
					cnt++;
				}
			}
		}
		
		
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n ; j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
}
