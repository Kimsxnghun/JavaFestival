package ex3;

public class Java27 {
	public static void main(String[] agrs) {
		
		int num1 = 50;
		int num2 = 15;
		char op = '-';
		
		System.out.println(cal(num1, num2, op));
		
	}
	
	private static int cal(int a, int b, char op) {
		
		if (op=='+') {
			return a+b;
		} else if (op=='-') {
			return a-b;
		} else if (op=='*') {
			return a*b;
		} else if (op=='/') {
			return a/b;
		} else {
			return 0;
		}
	}

}
