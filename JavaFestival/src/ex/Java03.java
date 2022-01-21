package ex;

import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력 >> ");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100 !=0)
		{
			System.out.println("윤년");
		}
		else if (year%400==0) 
		{
			System.out.println("윤년");
		}
		else 
		{
			System.out.println("윤년 아님");
		}
		// 배수일 땐 몫이 아닌 나머지로 판단한다
	}

}
