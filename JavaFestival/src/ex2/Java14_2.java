package ex2;

import java.util.Random;

public class Java14_2 {
	public static void main(String[] agrs) {
		// �ߺ� ���� ���ڸ� �̴� �ζ� ���α׷�
		
		Random r = new Random();
		int[] arr = new int[6];
		
		// �� ����, �ݺ����� �迭 ũ�⸸ŭ �ݺ�
		for(int i=0; i<arr.length; i++) 
		{
			arr[i] = r.nextInt(6)+1;
			// �ߺ� �� ó��
			for(int j=0; j<i; j++) 
			{
				if (arr[i]==arr[j]) 
				{ // ������ �ִ� ���� �ߺ��Ǹ� i--
					i--;
				}
			}
			
		}
		
		// �迭 �� ���
		for(int j=0; j<arr.length; j++) 
		{
			System.out.println("����� ���� : " + arr[j]);
		}
	}
}
