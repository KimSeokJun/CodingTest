package programmers.level1;

import java.util.Arrays;

/*
 * 제목 : 문자열 내 마음대로 정렬하기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12915
*/
public class Question_011 {
	public static void main(String[] args) {
		String[] strings = {"sun", "bed", "car"};
		int n = 1;
		
		Question_011 q = new Question_011();
		
		String[] result = q.solution(strings, n);
		for(String i : result) {
			System.out.println(i);
		}
		
	}
	
	public String[] solution(String[] strings, int n) {
		String2[] comp = new String2[strings.length];
		
		for(int i =0; i<strings.length; i++) {
			comp[i] = new String2(strings[i],n);
		}
		
		Arrays.sort(comp);
		
		for(int i =0; i<strings.length; i++) {
			strings[i] = comp[i].str;
		}
		
		
		return strings;
	}
	
	class String2 implements Comparable {
		String str;
		int n;
		String2(String str, int n){
			this.str = str;
			this.n = n;
		}
		
		
		public int compareTo(String2 ant) {
			int s = 0;
			if (this.str.length() >= this.n && ant.str.length() >= this.n){
				s = this.str.charAt(n) - ant.str.charAt(n);
			}
			
			if(s == 0) {
				s = this.str.compareTo(ant.str);
			}
			
			return s;
		}

		@Override
		public int compareTo(Object arg0) {
			String2 a = (String2) arg0;
			return this.compareTo(a);
		}
	}
}
