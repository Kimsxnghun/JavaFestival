package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class Java19 {
	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i=0; i<arr.length; i++)
		{
			System.out.print((i+1) + "번째 수 입력 : ");
			arr[i]= sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println("정렬 후");
		selectionSort(arr);
		
	}
	
	public static void selectionSort(int[] arr) {
		
		
		for(int j=0; j<arr.length; j++) 
		{
			int min = j;
			
			for(int i=j+1; i<arr.length; i++) 
			{
				if(arr[min]>arr[i]) 
				{
					min = i;
				}				
			}	
			
			int temp = arr[min];
			arr[min] = arr[j];
			arr[j]=temp;				
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
}
