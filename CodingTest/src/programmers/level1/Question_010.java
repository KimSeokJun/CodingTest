package programmers.level1;

/*
 * 제목 : 두 정수 사이의 합
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12912
*/
public class Question_010 {
	public static void main(String[] args) {
		int a = 0;
		int b = 10000000;
		
		Question_010 q = new Question_010();
		
		long result = q.solution(a, b);
		System.out.println(result);
		
	}
	
	public long solution(int a, int b) {
		long answer = 0;
		long max;
		long min;
		
		if(a > b) {
			max = a;
			min = b;
		}else {
			max = b;
			min = a;
		}
		
		answer = (min+max)*(max-min+1)/2;
		
		return answer;
	}
	
//	public long solution(int a, int b) {
//		long answer = 0;
//		if(a > b) {
//			int temp = b;
//			b = a;
//			a = temp;
//		}
//		for(; a <= b; a++) {
//			answer += a;
//		}
//		return answer;
//	}
}
