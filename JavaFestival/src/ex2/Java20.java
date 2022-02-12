package ex2;

import java.util.Scanner;

public class Java20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] arr = new int[n][n];
		int cnt = 1;
		
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				arr[j][i] = cnt;
				cnt++;
			}
		}
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		

	}
}
