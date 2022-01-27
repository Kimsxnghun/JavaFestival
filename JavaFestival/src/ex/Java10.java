package ex;

import java.util.Scanner;

public class Java10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("A 입력 >> ");
			int a = sc.nextInt();
			System.out.print("B 입력 >> ");
			int b = sc.nextInt();
			
			if  (a!=0 && b!=0)
			{
				System.out.print("결과 >> "+(a-b));
				System.out.println();	
			} 
			else if (a==0 && b==0)
			{
				break;
			}
		}
	}
}
