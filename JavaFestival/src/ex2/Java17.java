package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Java17 {
	public static void main(String[] agrs) {
		// 10���� ������ �Է� �޾� 2������ ��ȯ�ؼ� ����ϱ�
		// 10 �Է� �� �ᱣ�� --> 1010
		// 13 �Է� �� �ᱣ�� --> 1101
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� >> ");
		int a = sc.nextInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		
		// 10�������� ��Ÿ�� ���� 2�������� Ÿ��������
		// ���� 0�� �� ������ ��� 2�� ����� ���� �������� �������� ������ �ȴ�
		while(true)
		{
			if(a%2==1) // �������� 1�� ���
			{
				list.add(1);
			}
			else if (a%2==0) // �������� 0�� ���
			{
				list.add(0); 
			}
			
			a /= 2;

			if(a==0) {
				break;
			}
		}
		
		// �������� ���
		for(int i=0; i<list.size(); i++)
		{
			System.out.print(list.get(list.size()-i-1));
		}
		
		
		
		
	}
}
