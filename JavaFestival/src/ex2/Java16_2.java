package ex2;

public class Java16_2 {
	public static void main(String[] agrs) {
		// 1���� ���� �� ���� �Ÿ��� ª�� ��(index)�� ����ϱ�
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		// ���ȭ��
		// result = [3, 5] --> 3���� 5���� �Ÿ��� ���� ª��
		
		int a = 0;
		int b = 0;
		int dis = Math.abs(point[0]-point[1]);
		
		for(int i=0; i<point.length; i++) 
		{
			for(int j=i+1; j<point.length; j++)
			{
				int min = Math.abs(point[i]-point[j]);
				
				if(dis>min) 
				{
					dis = min;
					a=i;
					b=j;
				}
			}			
		}
		
		System.out.println("result = [" + a +", "+ b + "]");
		
	}
}
