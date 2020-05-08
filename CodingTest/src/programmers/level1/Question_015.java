package programmers.level1;

import java.util.Arrays;

/*
 * 제목 : 김서방 찾기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12919
*/
public class Question_015 {
	public static void main(String[] args) {
		String[] a = {"Jane", "Kim"};
		
		Question_015 q = new Question_015();
		
		String result = q.solution(a);
		
		System.out.println(result);
		
		
	}
	
	public String solution(String[] str) {
		int index = 0;
				
		for(String name : str) {
			if(name.equals("Kim")) {
				break;
			}
			index++;
		}
		
		return "김서방은 " +index+"에 있다";
	}
	
}
