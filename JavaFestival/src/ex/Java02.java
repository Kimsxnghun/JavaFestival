package ex;
import java.util.Scanner;

public class Java02 {

	public static void main(String[] args) {
//		System.out.print("현재금액 : ");
		Scanner sc = new Scanner(System.in);
//		int money = sc.nextInt();
//		System.out.println("잔돈변환");
		
//		int mon1 = money/10000;
//		System.out.println("10000원 : " + mon1 + "개");
//		int mon2 = (money%10000)/5000;
//		System.out.println("5000원 : " + mon2 + "개");
//		int mon3 = ((money%10000)%5000)/1000;
//		System.out.println("1000원 : " + mon3 + "개");
//		int mon4 = (((money%10000)%5000)%1000)/500;
//		System.out.println("500원 : " + mon4 + "개");
//		int mon5 = ((((money%10000)%5000)%1000)%500)/100;
//		System.out.println("100원 : " + mon5 + "개");
		
		System.out.print("현재금액 : ");
		int money2 = sc.nextInt();
		System.out.println("잔돈반환");
		
		int man = 10000;
		int mon1 = 0; // 잔돈 개수
//		mon1 = money2/man;
//		System.out.println(man +"원: " + mon1 +"개");
//		money2= money2%man;
//		man = man/2;
		
		for (int i = 0; i<5; i++) 
		{
			if (i%2==0) 
			{
				/* System.out.println("if clause in" + i); */
				mon1 = money2/man;
				System.out.println(man +"원: " + mon1 +"개");
				money2= money2%man;
				man = man/2;
			} else {
				/* System.out.println("else clause in" + i ); */
				mon1 = money2/man;
				System.out.println(man +"원: " + mon1 +"개");
				money2= money2%man;
				man = man/5;
			}
		}
	}

}
