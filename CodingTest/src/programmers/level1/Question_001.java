package programmers.level1;

/*
 * 제목 : 크레인 인형뽑기
 * URL : https://programmers.co.kr/learn/courses/30/lessons/64061
*/
public class Question_001 {
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		Question_001 q = new Question_001();
		
		int result = q.solution(board, moves);
		System.out.println(result); // 결과 : 4
		
	}
	
	public int solution(int[][] board, int[] moves) {
		int answer = 0;
		int[] memory = new int[moves.length];
		int memory_index = 0;
		
		for(int i : moves) {
			for(int j = 0; j < board.length; j++) {
				int temp = board[j][i-1];
				board[j][i-1] = 0;
				if(temp ==0) {
					continue;
				}
				
				if(memory_index == 0) {
					memory[memory_index++] = temp;
					break;
				}
				
				if(memory[memory_index-1] == temp) {
					answer++;
					memory_index--;
					break;
				}
				
				memory[memory_index++] = temp;
				break;
			}
		}
		
		return answer*2;		
	}
}
