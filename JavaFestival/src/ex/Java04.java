package ex;

import java.util.Scanner;

public class Java04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° ���� �Է� >> ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° ���� �Է� >> ");
		int num2 = sc.nextInt();
		
		System.out.println((num2%10)*num1);
		System.out.println(((num2/10)%10)*num1);
		System.out.println((((num2/10)/10)%10)*num1);
		
		System.out.println(num2*num1);
		
		
		
		
	}

}
