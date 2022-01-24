package ex;

import java.util.Scanner;

public class Java07_2 {
	public static void main(String[] args) {
		
		System.out.println("최대 공약수 & 최소 공배수 구하기");
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
						
		System.out.println("최대 공약수 : " + gdc(a, b));
		System.out.println("최소 공배수 : "+ lcm(a, b));
	}
	
	static int gdc(int a, int b) { //최대 공약수
		
		if(a<b) //유클리드 호제법 조건
		{
			int temp = a;
			a = b;
			b = temp;
		}
		
		while(b!=0) { //유클리드 호제법
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	
	static int lcm(int a, int b) { //최소 공배수
		return a*b / gdc(a,b);
	}
}
