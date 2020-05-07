package programmers.level1;

/*
 * 제목 : 가운데 글자 가져오기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12903
*/
public class Question_006 {
	public static void main(String[] args) {
		String s = "abcde";
		
		Question_006 q = new Question_006();
		
		String result = q.solution(s);
		System.out.println(result);
		
	}
	
	public String solution(String s) {
		String answer = "";
		int start = s.length()/2;
		if(s.length()%2 == 0) {
			answer = s.substring(start-1, start+1);
		}else {
			answer = s.substring(start, start+1);
		}
		
		return answer;
		
//		return s.substring((s.length()-1)/2, s.length()/2+1);
	}
}
