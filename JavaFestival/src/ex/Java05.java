package ex;

public class Java05 {

	public static void main(String[] args) {
		
		int plus = 0;
		int minus = 0;
		
		for(int i=1, j=2 ; i<100 ; i+=2,j+=2) 
		{
			System.out.print(i+" ");
			System.out.print(-j+" ");
			plus += i;			
			minus -= j;
		}
		
		int sum = plus+minus;
		
		System.out.println();
		System.out.println("°á°ú : "+sum);
			
	}
}
