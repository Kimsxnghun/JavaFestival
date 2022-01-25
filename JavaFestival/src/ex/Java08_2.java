package ex;

import java.util.Scanner;

public class Java08_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		
		System.out.println("출력 : " + fact(num));
	}
	
	static int fact(int n) {
		if(n<=1) 
		{
			return n;
		} 
		else 
		{
			return fact(n-1)*n;
		}
	}
}
