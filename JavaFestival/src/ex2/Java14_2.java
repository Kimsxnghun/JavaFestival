package ex2;

import java.util.Random;

public class Java14_2 {
	public static void main(String[] agrs) {
		// 중복 없이 숫자를 뽑는 로또 프로그램
		
		Random r = new Random();
		int[] arr = new int[6];
		
		// 값 삽입, 반복문은 배열 크기만큼 반복
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = r.nextInt(6)+1;
			// 중복 값 처리
			for(int j=0; j<i; j++) 
			{
				if (arr[i]==arr[j]) 
				{ // 기존에 있는 값이 중복되면 i--
					i--;
				}
			}
			
		}
		
		// 배열 값 출력
		for(int j=0; j<arr.length; j++) 
		{
			System.out.println("행운의 숫자 : " + arr[j]);
		}
	}
}
