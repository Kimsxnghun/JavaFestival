package ex2;

import java.util.Random;

public class Java13 {
	public static void main(String[] args) {
		
		int[] intArray = new int[8]; // �迭 ����
		Random ran = new Random(); // ���� ��ü
		
		System.out.print("�迭�� �ִ� ��� �� : ");

		// �� ����
		for(int i=0; i<intArray.length; i++) 
		{
			intArray[i] = ran.nextInt(100);
		}
		// �� ���
		for(int i=0; i<intArray.length; i++) 
		{
			System.out.print(intArray[i] + " ");
		}
		System.out.println();
		
		// ū ��, ���� �� 
		int max = intArray[0]; //** �񱳸� ���� ���� �ʿ�
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

		System.out.print("���� ū �� : " + max);
		System.out.println();
		System.out.print("���� ���� �� : " + min);
		
		
	}
}
