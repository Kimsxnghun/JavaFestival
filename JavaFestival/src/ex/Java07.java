package ex;

import java.util.Scanner;

public class Java07 {
	public static void main(String[] args) {
		
		System.out.println("최대 공약수 & 최소 공배수 구하기");
		System.out.print("숫자1입력 >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.print("숫자2입력 >> ");
		int num2 = sc.nextInt();
		
		int max = 0; //최대 공약수
		
		for(int i=1; i<=num1 && i<=num2; i++) 
		{
			if(num1%i==0 && num2%i==0)
			{
				max = i;
			}
		}		
		
		int min = (num1*num2)/max; //최소 공배수

		System.out.println("최대 공약수 : " + max);		
		System.out.println("최소 공배수 : " + min);
	}
}
