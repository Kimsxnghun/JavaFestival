package ex2;

import java.util.Scanner;

public class Java15 {
	public static void main(String[] args) {
		
		// n과 x를 입력 받는다
		Scanner sc = new Scanner(System.in);
		System.out.print("N 입력 >> ");
		int n = sc.nextInt();
		System.out.print("X 입력 >> ");
		int x = sc.nextInt();
		
		// n개의 정수를 담을 배열 생성
		int[] arr = new int[n];
		for(int i=0; i<arr.length; i++) 
		{
			System.out.print((i+1) + "번째 정수 입력 >> ");
			arr[i] = sc.nextInt();
		}
		
		// n개의 정수 중 x보다 작은 수만 출력
		System.out.print("결과 >> ");
		for(int i=0; i<arr.length; i++) 
		{
			if(arr[i]<x) 
			{
				System.out.print(arr[i] + " ");				
			}
		}
	}
}
