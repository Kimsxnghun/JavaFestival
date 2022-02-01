package ex2;

import java.util.Scanner;

public class Java11 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("n ют╥б : ");
		int n = sc.nextInt();

		for(int i=1; i<=n; i++) {
			System.out.print(seq(i)+" ");
		}
		
	}
	
	public static int seq(int n) {
		
		if (n==1) {
			return 1;
		} else {
			return seq(n-1)+(n-1);
		} 
		
	}
}
