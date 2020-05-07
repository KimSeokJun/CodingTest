package programmers.level1;

/*
 * 제목 : 나누어 떨어지는 숫자 배열
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12910
*/
public class Question_009 {
	public static void main(String[] args) {
		int[] arr = {5, 9, 7, 10};
		int divisor = 5;
		
		Question_009 q = new Question_009();
		
		int[] result = q.solution(arr, divisor);
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
	public int[] solution(int[] arr, int divisor) {
		int[] ans = new int[arr.length];
		int index = 0;
		
		for(int i : arr) {
			if(i % divisor == 0) {
				ans[index++] = i;
			}
		}
		
		if(index == 0) {
			return new int[] {-1};
		}
		
		int[] answer = new int[index];
		for(int i=0; i<index; i++) {
			int j = i;
			for(; j>0; j--) {
				if(answer[j-1] > ans[i]) {
					answer[j] = answer[j-1];
				}else {
					break;
				}
			}
			answer[j] = ans[i];
			
		}
		
		return answer;
	}
}
