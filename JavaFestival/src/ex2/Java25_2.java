package ex2;

public class Java25_2 {
	public static void main(String[] agrs) {
		
		// �ƽ�Ű�ڵ� ����
		char a = 65;
//		System.out.println(a); -> A
//		a++;
//		System.out.println(a); -> B
			
		int n = 5;
		char[][] arr = new char[n][n];
		
		// �Է�1 (�߽� ����)
		for(int i=0; i<n; i++) 
		{
			for(int j=i; j<n-i; j++) 
			{
				arr[i][j] = a;
				a++;
			}
		}
		
		// �Է�2 (�߽� ����)
		for(int i=n/2+1; i<n; i++) 
		{
//			for(int j=n/2-1-i+(n/2+1); j<n/2+2+i-(n/2+1); j++) 
			for(int j=n-1-i; j< 1+i; j++)
				// �����ϴ� �� + i - (i�� ù ��° ��)
			{
				arr[i][j] = a;
				a++;
			}
		}
		
		
		// ���
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
