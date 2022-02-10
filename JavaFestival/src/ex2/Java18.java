package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Java18 {
	public static void main(String[] agrs) {
		// 버블정렬
		// 옆의 배열과 계속 비교하면서 치환
		
		// 값 입력
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) 
		{			
			System.out.print((i+1) + "번째 수 입력 : ");
			arr[i] = sc.nextInt();
		}
		// 정렬 전
		System.out.println("정렬 전");
		System.out.println(Arrays.toString(arr));
		
		// 정렬
		for(int i=1; i<arr.length; i++) 
		{
			for(int j=0; j<arr.length-i; j++) 
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
				}
			}
		}
		
		// 정렬 후
		System.out.println("정렬 후");
		for(int i:arr) 
		{
			System.out.print(i+ " ");
		}
		
		
	}
}
