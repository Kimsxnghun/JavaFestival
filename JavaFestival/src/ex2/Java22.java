package ex2;

public class Java22 {
	public static void main(String[] agrs) {
		
		int n = 7;
		int[][] arr = new int[n][n];
		int cnt = 1;
		
		
		// 입력1 (절반 까지)
		for(int j=0; j<n/2+1 ; j++) 
		{			
			for(int i=n/2-j ; i<n/2+1+j; i++) 
			{
				arr[j][i]=cnt;
				cnt++;
			}
		}
		// 입력2 (절반 이후)
		for(int j=n/2+1 ; j<n ; j++) 
		{
			for(int i=j-n/2 ; i<n+n/2-j; i++)
			{
				arr[j][i] = cnt;
				cnt++;
			}			
		}
		
		// 출력
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n ; j++) 
			{
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
