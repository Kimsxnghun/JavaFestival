package ex;

import java.util.Scanner;

public class Java10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("A �Է� >> ");
			int a = sc.nextInt();
			System.out.print("B �Է� >> ");
			int b = sc.nextInt();
			
			if  (a!=0 && b!=0)
			{
				System.out.print("��� >> "+(a-b));
				System.out.println();	
			} 
			else if (a==0 && b==0)
			{
				break;
			}
		}
	}
}