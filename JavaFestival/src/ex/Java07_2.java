package ex;

import java.util.Scanner;

public class Java07_2 {
	public static void main(String[] args) {
		
		System.out.println("�ִ� ����� & �ּ� ����� ���ϱ�");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
						
		System.out.println("�ִ� ����� : " + gdc(a, b));
		System.out.println("�ּ� ����� : "+ lcm(a, b));
	}
	
	static int gdc(int a, int b) { //�ִ� �����
		
		if(a<b) //��Ŭ���� ȣ���� ����
		{
			int temp = a;
			a = b;
			b = temp;
		}
		
		while(b!=0) { //��Ŭ���� ȣ����
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
	static int lcm(int a, int b) { //�ּ� �����
		return a*b / gdc(a,b);
	}
}
