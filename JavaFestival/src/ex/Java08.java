package ex;

import java.util.Scanner;

public class Java08 {
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int num = sc.nextInt();
		int fact = 1; //곱해야 하므로 기본값을 1로 설정
		
		for(int i=2; i<=num; i++) 
		{
			fact *= i;
		}
		
		System.out.println("출력 : "+ fact);
		
	}
}
