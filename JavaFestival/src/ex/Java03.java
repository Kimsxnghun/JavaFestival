package ex;

import java.util.Scanner;

public class Java03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("?⵵ ?Է? >> ");
		int year = sc.nextInt();
		
		if(year%4==0 && year%100 !=0)
		{
			System.out.println("????");
		}
		else if (year%400==0) 
		{
			System.out.println("????");
		}
		else 
		{
			System.out.println("???? ?ƴ?");
		}
		// ?????? ?? ???? ?ƴ? ???????? ?Ǵ??Ѵ?
	}

}
