package ex2;

public class Java16 {
	public static void main(String[] args) {
		// 1���� ���� �� ���� �Ÿ��� ª�� ��(index)�� ����ϱ�
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		// ���ȭ��
		// result = [3, 5] --> 3���� 5���� �Ÿ��� ���� ª��

		// �Ÿ� ���� ������ �迭
		int size = 0; // �迭 ũ��
		for(int i=1; i<point.length; i++) 
		{
			size += i;
		}
		// System.out.println(size);
		int[] dis = new int[size];

		int min = 0; // dis �ε��� ��ȣ
		int a = 0; // point �ε��� ��ȣ1
		int b = 0; // point �ε��� ��ȣ2
		
		for(int i = 0, k = 0; i<point.length; i++) 
		{
			for(int j = i+1; j<point.length; j++, k++)
			{
				dis[k] = Math.abs(point[i]-point[j]); // �Ÿ��� ���밪
				 
				if(dis[min]>dis[k]) // �ּҰ� ���ϱ�
				{
					min = k; //** ���� �� ���� �ٲ������
					a = i;
					b = j;
				}
			}
		}
		
		System.out.println(min); // �ּҰ��� ��� dis�� �ε��� ��ȣ
		System.out.println(dis[min]); // �Ÿ� �ּҰ� 
		System.out.println("result = [" + a +", "+ b + "]"); // �ּҰ��� �� ��
		
		
	}
}
