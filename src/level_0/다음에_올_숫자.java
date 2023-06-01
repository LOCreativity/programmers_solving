package level_0;

class Solution7 {
    public int solution(int[] common) {
        int answer = 0;
        int temp;
        
        if((common[1] - common[0]) == (common[2] - common[1])) {
        	temp = common[1] - common[0];
        	answer = common[common.length-1] + temp;;
        }
        else { 
        	temp = common[1] / common[0];
        	answer = common[common.length-1] * temp;;
        }
        
        
        return answer;
    }
}

public class 다음에_올_숫자 {
	public static void main(String []args) {
		int []common = {2, 4, 8};
		
		Solution7 ob = new Solution7();
		System.out.println(ob.solution(common));
	}
}
