package ex2;

import java.util.Random;

public class Java14 {
	public static void main(String[] agrs) {
		// 중복 없이 숫자를 뽑는 로또 프로그램
		
		Random r = new Random();
		int[] arr = new int[6];
		int i = 0;
		
		// 값 삽입, 반복문은 배열 크기만큼 반복
		// 반복 횟수가 정해져 있기 때문에 for문 사용하는 것이 더 좋을듯
		while(i<arr.length) 
		{
			// 배열에 난수 삽입
			arr[i] = r.nextInt(6)+1;
			
			// 중복 값 처리
			for(int j=0; j<i; j++) 
			{
				if (arr[i]==arr[j]) 
				{ // 기존에 있는 값이 중복되면 i--
					i--;
				}
			}
			
			// 다음 값을 넣기 위해 i++
			i++;
			
		}
		
		// 배열 값 출력
		for(int j=0; j<arr.length; j++) 
		{
			System.out.println("행운의 숫자 : " + arr[j]);
		}
	}
}
