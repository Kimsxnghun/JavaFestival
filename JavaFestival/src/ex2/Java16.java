package ex2;

public class Java16 {
	public static void main(String[] args) {
		// 1차원 점들 중 가장 거리가 짧은 점(index)를 출력하기
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		// 결과화면
		// result = [3, 5] // 3번과 5번의 거리가 가장 짧다는 말인듯
		
		// 거리 = 점 - 점
		
		// 0번 1번 비교
		// 0번 2번 비교
		// 0번 3번 비교
		// 0번 4번 비교
		// 0번 5번 비교
		// 0번 6번 비교 - > 6회
		
		// 1번 2번 비교
		// 1번 3번 비교 ... 
		// 1번 6번 비교 -> 5회
		
		// 2번 -> 4회
		
		// 3번 -> 3회
		
		// ..
		
		// 6번 -> 1회
		
		
	}
}
