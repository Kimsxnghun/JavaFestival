package ex2;

public class Java16 {
	public static void main(String[] args) {
		// 1차원 점들 중 가장 거리가 짧은 점(index)를 출력하기
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		// 결과화면
		// result = [3, 5] --> 3번과 5번의 거리가 가장 짧다

		// 거리 값을 저장할 배열
		int size = 0; // 배열 크기
		for(int i=1; i<point.length; i++) 
		{
			size += i;
		}
		// System.out.println(size);
		int[] dis = new int[size];

		int min = 0; // dis 인덱스 번호
		int a = 0; // point 인덱스 번호1
		int b = 0; // point 인덱스 번호2
		
		for(int i = 0, k = 0; i<point.length; i++) 
		{
			for(int j = i+1; j<point.length; j++, k++)
			{
				dis[k] = Math.abs(point[i]-point[j]); // 거리의 절대값
				 
				if(dis[min]>dis[k]) // 최소값 구하기
				{
					min = k; //** 작을 때 값을 바꿔줘야함
					a = i;
					b = j;
				}
			}
		}
		
		System.out.println(min); // 최소값인 경우 dis의 인덱스 번호
		System.out.println(dis[min]); // 거리 최소값 
		System.out.println("result = [" + a +", "+ b + "]"); // 최소값인 두 점
		
		
	}
}
