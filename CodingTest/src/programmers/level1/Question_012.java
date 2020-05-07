package programmers.level1;

import java.util.Arrays;

/*
 * 제목 : 문자열 내 p와 y의 개수
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12916
*/
public class Question_012 {
	public static void main(String[] args) {
		String a = "pPoooyY";
		
		Question_012 q = new Question_012();
		
		boolean result = q.solution(a);
		
		System.out.println(result);
		
		
	}
	
	public boolean solution(String str) {
		str = str.toLowerCase();
		int y = 0;
		int p = 0;
		
		for(int i=0; i<str.length(); i++) {
			char temp = str.charAt(i);
			
			if(temp == 'y') {
				y++;
			}else if(temp == 'p') {
				p++;
			}
		}
		
		if(y==p) {
			return true;
		}
		
		return false;
	}
	
}
