package ex;

import java.util.Scanner;

public class Java07 {
	public static void main(String[] args) {
		
		System.out.println("�ִ� ����� & �ּ� ����� ���ϱ�");
		System.out.print("����1�Է� >> ");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		System.out.print("����2�Է� >> ");
		int num2 = sc.nextInt();
		
		int max = 0; //�ִ� �����
		
		for(int i=1; i<=num1 && i<=num2; i++) 
		{
			if(num1%i==0 && num2%i==0)
			{
				max = i;
			}
		}		
		
		int min = (num1*num2)/max; //�ּ� �����

		System.out.println("�ִ� ����� : " + max);		
		System.out.println("�ּ� ����� : " + min);
	}
}
