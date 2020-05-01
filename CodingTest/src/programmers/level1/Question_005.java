package programmers.level1;

/*
 * 제목 : K번째수
 * URL : https://programmers.co.kr/learn/courses/30/lessons/42748
*/
public class Question_005 {
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		
		Question_005 q = new Question_005();
		
		int[] result = q.solution(array, commands);
		for(int i : result) {
			System.out.println(i);
		}
		
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int count = 0;
		for(int[] com : commands) {
			int start = com[0];
			int end = com[1];
			int index = com[2];
			
			int[] sub = new int[end-start+1];
			int sub_ap = 0;
			
			for(int ind=start-1; ind<end; ind++) {
				int temp = array[ind];
				
				// 삽입정렬
				for(int i=sub_ap; i>=0; i--) {
					if(i == 0) {
						sub[i] = temp;
						sub_ap++;
					}else if(sub[i-1] > temp) {
						sub[i] = sub[i-1];
					}else {
						sub[i] = temp;
						sub_ap++;
						break;
					}
				}
			}
			
			answer[count++] = sub[index-1];
		}
		
		return answer;
	}
}
