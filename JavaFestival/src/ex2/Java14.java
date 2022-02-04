package ex2;

import java.util.Random;

public class Java14 {
	public static void main(String[] agrs) {
		// 중복 없이 숫자를 뽑는 로또 프로그램
		
		Random r = new Random();
		int[] arr = new int[6];
		int i = 0;
		
		while(i<6) {
			arr[i] = r.nextInt(9)+1;
			i++;
			
			// 중복을 체크해야하는데...
			if(i>0 && arr[i] == arr[i-1]) {
				i--;
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.println("행운의 숫자 : " + arr[j]);
		}
	}
}
