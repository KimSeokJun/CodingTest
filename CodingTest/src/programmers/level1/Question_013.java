package programmers.level1;

import java.util.Arrays;

/*
 * 제목 : 문자열 내림차순으로 배치하기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12917
*/
public class Question_013 {
	public static void main(String[] args) {
		String a = "Zbcdefg";
		
		Question_013 q = new Question_013();
		
		String result = q.solution(a);
		
		System.out.println(result);
		
		
	}
	
	public String solution(String str) {
		char[] chars = str.toCharArray();
		int[] charint = new int[chars.length];
				
		for(int i=0; i<chars.length; i++) {
			charint[i] = ((int) chars[i]) * -1;
		}
		
		Arrays.sort(charint);
		
		for(int i=0; i<chars.length; i++) {
			chars[i] = (char) (charint[i] * -1);
		}
		
		str = new String(chars);
		
		return str;
	}
	
}
