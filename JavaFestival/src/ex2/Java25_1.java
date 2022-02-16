package ex2;

public class Java25_1 {
	public static void main(String[] agrs) {
		
		// 아스키코드 원리
		char a = 65;
//		System.out.println(a); -> A
//		a++;
//		System.out.println(a); -> B
		
		// 입력
		int n = 5;
		char[][] arr = new char[n][n];
		for(int i=0; i<n; i++) 
		{
			for(int j=0; j<n; j++) 
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
