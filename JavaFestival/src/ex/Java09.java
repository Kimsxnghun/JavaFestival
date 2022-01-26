package ex;

import java.util.Scanner;

public class Java09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("소인수분해 할 수를 입력하세요. : ");
		int num = sc.nextInt();
		int i=2;
		
		while(num!=1) 
		{
			if(num%i==0) 
			{
				System.out.print(i);
				num /= i;
				if (num>i) 
				{
					System.out.print("*");					
				} 
				else 
				{
					break;
				}
			} 
			else 
			{
				i++;
			}
		}
	}
}
