package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Java18_2 {
	public static void main(String[] args) {
		// ��������
		// ���� �迭�� ��� ���ϸ鼭 ġȯ
		
		// �� �Է�
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++) 
		{			
			System.out.print((i+1) + "��° �� �Է� : ");
			arr[i] = sc.nextInt();
		}
		// ���� ��
		System.out.println("���� ��");
		System.out.println(Arrays.toString(arr));		
		
		bubbleSort(arr);
		
		

	}
	
	public static void bubbleSort(int[] arr) {
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
		System.out.println("���� ��");
		System.out.println(Arrays.toString(arr));
	}
}
