package programmers.level1;

/*
 * 제목 : 소수 찾기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/12921
*/
public class Question_016 {
	public static void main(String[] args) {
		int n = 10000;
		
		Question_016 q = new Question_016();
		
		int result = q.solution(n);
		
		System.out.println(result);
		
		
	}
	
	public int solution(int n) {
		int index = 1;
		int[] num_list = new int[(int) Math.sqrt(n)];
		boolean stat = true;
		
		num_list[0] = 2;
		if(n == 2) {
			return 1;
		}
		int i = 3;
				
		for(; i <= (int) Math.sqrt(n); i+=2) {
			stat = true;
			for(int j=0; j<index; j++) {
				if(i%num_list[j] == 0) {
					stat = false;
					break;
				}
			}
			
			if(stat) {
				num_list[index++] = i;
			}
		}
		
		int count = index;
		for(; i<= n; i+=2) {
			stat = true;
			for(int j=0; j<index; j++) {
				if(i%num_list[j] == 0) {
					stat = false;
					break;
				}
			}
			
			if(stat) {
				count++;
			}
		}
		
		return count;
	}
	
}
