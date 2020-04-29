package programmers.level1;

import java.util.HashMap;

/*
 * 제목 : 완주하지 못한 선수
 * URL : https://programmers.co.kr/learn/courses/30/lessons/42576
*/
public class Question_002 {
	public static void main(String[] args) {
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		Question_002 q = new Question_002();
		
		String result = q.solution(participant, completion);
		System.out.println(result); // 결과 : 4
		
	}
	
	public String solution(String[] participant, String[] completion) {
		/* < 첫번째 풀이 > */
		
//		String answer = "";
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		
//		boolean stat = false;
//		for(int i = 0 ; i < completion.length; i++) {
//			if(!participant[i].equals(completion[i])) {
//				answer = participant[i];
//				stat = true;
//				break;
//			}
//		}
//		
//		if(!stat) {
//			answer = participant[participant.length-1];
//		}
//		
//		return answer;
		
		/* < 두번째 풀이 > */
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		 
		for(String i : completion) {
			Integer value = map.get(i);
			if(value == null) {
				value = 0;
			}
			map.put(i, ++value);
		}
		
		for(String i: participant) {
			Integer value = map.get(i);
			if(value == null || value == 0) {
				return i;
			}
			map.put(i, --value);
		}
		return "";
	}
}
