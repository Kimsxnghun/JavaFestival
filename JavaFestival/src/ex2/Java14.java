package ex2;

import java.util.Random;

public class Java14 {
	public static void main(String[] agrs) {
		// �ߺ� ���� ���ڸ� �̴� �ζ� ���α׷�
		
		Random r = new Random();
		int[] arr = new int[6];
		int i = 0;
		
		while(i<6) {
			arr[i] = r.nextInt(9)+1;
			i++;
			
			// �ߺ��� üũ�ؾ��ϴµ�...
			if(i>0 && arr[i] == arr[i-1]) {
				i--;
			}
		}
		
		for(int j=0; j<arr.length; j++) {
			System.out.println("����� ���� : " + arr[j]);
		}
	}
}
