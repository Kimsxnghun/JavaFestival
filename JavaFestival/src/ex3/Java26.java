package ex3;

public class Java26 {
	public static void main(String[] agrs) {
		
		int num1 = 10;
		int num2 = 2;
		boolean result = isDivide(num1, num2);
		System.out.println("결과 확인 : " + result);
		
	}

	public static boolean isDivide(int a, int b) {
	
		if(a%b==0) {
			return true;
		} else {
			return false;
		}
	
	}
}
