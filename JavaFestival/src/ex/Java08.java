package ex;

import java.util.Scanner;

public class Java08 {
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է� : ");
		int num = sc.nextInt();
		int fact = 1; //���ؾ� �ϹǷ� �⺻���� 1�� ����
		
		for(int i=2; i<=num; i++) 
		{
			fact *= i;
		}
		
		System.out.println("��� : "+ fact);
		
	}
}
