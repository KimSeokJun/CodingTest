package programmers.level1;

import java.util.LinkedList;

/*
 * 제목 : 체육복
 * URL : https://programmers.co.kr/learn/courses/30/lessons/42862
*/
public class Question_004 {
	public static void main(String[] args) {
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		
		Question_004 q = new Question_004();
		
		int result = q.solution(n, lost, reserve);
		System.out.println(result);
		
	}
	
	public int solution(int n, int[] lost, int[] reserve) {
		int[] stat = new int[n];
		
		for(int i : lost) {
			stat[i-1] = -1;
		}
		
		for(int i : reserve) {
			stat[i-1] += 1;
		}
		
		for(int i : reserve) {
			if(stat[i-1] == 0) {
				continue;
			}
			
			if(i > 1 && stat[i-2] < 0) {
				stat[i-2] += 1;
			}else if(i < n && stat[i] < 0) {
				stat[i] += 1;
			}
		}
		
		int answer = 0;
		for(int i : stat) {
			if(i >= 0) {
				answer++;
			}
		}
		
		return answer;
	}
}
