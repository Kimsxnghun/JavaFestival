package ex2;

public class Java25_2 {
	public static void main(String[] agrs) {
		
		// 아스키코드 원리
		char a = 65;
//		System.out.println(a); -> A
//		a++;
//		System.out.println(a); -> B
			
		int n = 5;
		char[][] arr = new char[n][n];
		
		// 입력1 (중심 까지)
		for(int i=0; i<n; i++) 
		{
			for(int j=i; j<n-i; j++) 
			{
				arr[i][j] = a;
				a++;
			}
		}
		
		// 입력2 (중심 이후)
		for(int i=n/2+1; i<n; i++) 
		{
//			for(int j=n/2-1-i+(n/2+1); j<n/2+2+i-(n/2+1); j++) 
			for(int j=n-1-i; j< 1+i; j++)
				// 시작하는 값 + i - (i의 첫 번째 값)
			{
				arr[i][j] = a;
				a++;
			}
		}
		
		
		// 출력
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
			{
				System.out.print(arr[i][j] + "  ");
			}
			System.out.println();
		}
		
	}
}
