package ex2;

public class Java21 {
	public static void main(String[] args) {
		
		int n = 5;
		int[][] arr = new int[n][n];
		int cnt=1;
		
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				arr[i][j]=cnt;
				cnt++;
			}
		}
		
		// ����
		System.out.println("����");
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 180�� ȸ��
		System.out.println("\n180�� ȸ��");
		for(int i=arr.length-1; i>=0; i--) 
		{
			for(int j=arr[i].length-1; j>=0; j--) 
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
		
		// 180�� ȸ��2
		System.out.println("\n180�� ȸ��");
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				System.out.print(arr[n-(i+1)][n-(j+1)] + "\t");
			}
			System.out.println();
		}
	}
}
