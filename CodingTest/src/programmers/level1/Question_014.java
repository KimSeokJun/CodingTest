package programmers.level1;

import java.util.Arrays;

/*
 * 제목 : 문자열 다루기 기본
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12918
*/
public class Question_014 {
	public static void main(String[] args) {
		String a = "Zbcdefg";
		
		Question_014 q = new Question_014();
		
		boolean result = q.solution(a);
		
		System.out.println(result);
		
		
	}
	
	public boolean solution(String str) {
		char[] chars = str.toCharArray();
		
		if(chars.length != 4 && chars.length != 6) {
			return false;
		}
				
		for(char i : chars) {
			if( i < '0' || i > '9') {
				return false ;
			}
		}
		
		
		return true;
	}
	
}
