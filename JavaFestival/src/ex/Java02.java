package ex;
import java.util.Scanner;

public class Java02 {

	public static void main(String[] args) {
//		System.out.print("����ݾ� : ");
		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//		System.out.println("�ܵ���ȯ");
		
//		int mon1 = money/10000;
//		System.out.println("10000�� : " + mon1 + "��");
//		int mon2 = (money%10000)/5000;
//		System.out.println("5000�� : " + mon2 + "��");
//		int mon3 = ((money%10000)%5000)/1000;
//		System.out.println("1000�� : " + mon3 + "��");
//		int mon4 = (((money%10000)%5000)%1000)/500;
//		System.out.println("500�� : " + mon4 + "��");
//		int mon5 = ((((money%10000)%5000)%1000)%500)/100;
//		System.out.println("100�� : " + mon5 + "��");
		
		System.out.print("����ݾ� : ");
		int money2 = sc.nextInt();
		System.out.println("�ܵ���ȯ");
		
		int man = 10000;
		int mon1 = 0; // �ܵ� ����
//		mon1 = money2/man;
//		System.out.println(man +"��: " + mon1 +"��");
//		money2= money2%man;
//		man = man/2;
		
		for (int i = 0; i<5; i++) 
		{
			if (i%2==0) 
			{
				/* System.out.println("if clause in" + i); */
				mon1 = money2/man;
				System.out.println(man +"��: " + mon1 +"��");
				money2= money2%man;
				man = man/2;
			} else {
				/* System.out.println("else clause in" + i ); */
				mon1 = money2/man;
				System.out.println(man +"��: " + mon1 +"��");
				money2= money2%man;
				man = man/5;
			}
		}
	}

}
