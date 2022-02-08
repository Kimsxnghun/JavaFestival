package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Java17 {
	public static void main(String[] agrs) {
		// 10진수 정수를 입력 받아 2진수로 변환해서 출력하기
		// 10 입력 시 결괏값 --> 1010
		// 13 입력 시 결괏값 --> 1101
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 >> ");
		int a = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		// 10진법으로 나타낸 수를 2진법으로 타나내려면
		// 몫이 0이 될 때까지 계속 2로 나누어서 생긴 나머지를 역순으로 적으면 된다
		while(true)
		{
			if(a%2==1) // 나머지가 1인 경우
			{
				list.add(1);
			}
			else if (a%2==0) // 나머지가 0인 경우
			{
				list.add(0); 
			}
			
			a /= 2;

			if(a==0) {
				break;
			}
		}
		
		// 역순으로 출력
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(list.size()-i-1));
		}
		
		
		
		
	}
}
