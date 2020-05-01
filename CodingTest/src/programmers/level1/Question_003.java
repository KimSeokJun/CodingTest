package programmers.level1;

import java.util.LinkedList;

/*
 * 제목 : 모의고사
 * URL : https://programmers.co.kr/learn/courses/30/lessons/42840
*/
public class Question_003 {
	public static void main(String[] args) {
		int[] answers = {1,3,2,4,2};
		
		Question_003 q = new Question_003();
		
		int[] result = q.solution(answers);
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
	public int[] solution(int[] answers) {
		int[] one = {1,2,3,4,5};
		int[] two = {2,1,2,3,2,4,2,5};
		int[] three = {3,3,1,1,2,2,4,4,5,5};
		
		int[] score = {0,0,0};
		int max = -1;
		
		for(int i=0; i<answers.length; i++) {
			int answer = answers[i];
			if(one[i%one.length] == answer) {
				score[0]++;
			}
			
			if(two[i%two.length] == answer) {
				score[1]++;
			}
			
			if(three[i%three.length] == answer) {
				score[2]++;
			}
			
		}
		
		for(int i=0; i<score.length; i++) {
			if(score[i] >= max) {
				max = score[i];
			}
		}
		
		int[] result = new int[3];
		int l = 0;
		for(int i=0; i<score.length; i++) {
			if(score[i] >= max) {
				result[l++] = i+1;
			}
		}
		
		int[] re = new int[l];
		for(int i=0; i<l; i++) {
			re[i] = result[i];
		}
		
		return re;
	}
}
