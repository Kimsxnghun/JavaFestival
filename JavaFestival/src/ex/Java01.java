package ex;
import java.util.Scanner;

public class Java01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반올림 전 값: ");
		int num1 = sc.nextInt();
		
		System.out.print("반올림 후 값 : ");
		
		if(num1%10>=5) 
		{
			num1 = (num1+10)/10*10; // (num/10+1)*10
		} 
		else 
		{
			num1 = num1/10*10;			
		}

		System.out.print(num1);
	}

}
