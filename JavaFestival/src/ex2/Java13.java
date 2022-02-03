package ex2;

import java.util.Random;

public class Java13 {
	public static void main(String[] args) {
		
		int[] intArray = new int[8]; // 배열 선언
		Random ran = new Random(); // 랜덤 객체
		
		System.out.print("배열에 있는 모든 값 : ");

		// 값 삽입
		for(int i=0; i<intArray.length; i++) 
		{
			intArray[i] = ran.nextInt(100);
		}
		// 값 출력
		for(int i=0; i<intArray.length; i++) 
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		// 큰 수, 작은 수 
		int max = intArray[0]; //** 비교를 위한 변수 필요
		int min = intArray[0];
		
		for(int i = 1; i<intArray.length; i++) 
		{
			if(max<intArray[i]) 
			{
				max = intArray[i];
			}
			if(min>intArray[i]) 
			{
				min = intArray[i];
			}
		}

		System.out.print("가장 큰 값 : " + max);
		System.out.println();
		System.out.print("가장 작은 값 : " + min);
		
		
	}
}
