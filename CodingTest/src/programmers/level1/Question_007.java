package programmers.level1;

/*
 * 제목 : 2016년
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12901
*/
public class Question_007 {
	public static void main(String[] args) {
		int a = 5;
		int b = 24;
		
		Question_007 q = new Question_007();
		
		String result = q.solution(a, b);
		System.out.println(result);
		
	}
	
	public String solution(int a, int b) {
		String answer = "";
		int[] days = {0,31,29,31,30,31,30,31,31,30,31,30};
		String[] weeks = {"THU","FRI", "SAT", "SUN", "MON", "TUE", "WED"};
		
		for(int i =0; i<a; i++) {
			b += days[i];
			b = b%7;
		}
		
		answer = weeks[b];
		
		return answer;
	}
}
