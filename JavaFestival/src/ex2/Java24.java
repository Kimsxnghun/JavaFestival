package ex2;

public class Java24 {
	public static void main(String[] agrs) {
		
		int[][] arr= new int[5][5];
		int cnt = 1;
		
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				arr[i][j]=cnt;
				cnt++;
			}
		}
		
		// 출력
		System.out.println("원본");
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		// 90도 회전
		System.out.println("\n90도 회전");
		for(int i=0; i<arr.length; i++) 
		{
			for(int j=0; j<arr[i].length; j++) 
			{
				System.out.print(arr[j][arr.length-(i+1)]+"\t");
			}
			System.out.println();
		}
		
		
	}
}
