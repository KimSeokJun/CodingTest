package programmers.level1;

/*
 * 제목 : 같은 숫자는 싫어
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12906
*/
public class Question_008 {
	public static void main(String[] args) {
		int[] arr = {1,1,3,3,0,1,1};
		
		Question_008 q = new Question_008();
		
		int[] result = q.solution(arr);
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
	public int[] solution(int[] arr) {
		int[] ans = new int[arr.length];
		int index = 0;
		int save = -1;
		
		for(int i : arr) {
			if(save == i) {
				continue;
			}
			ans[index++] = i;
			save = i;
		}
		
		int[] answer = new int[index];
		for(int i=0; i<index; i++) {
			answer[i] = ans[i];
		}
		
		return answer;
	}
}
