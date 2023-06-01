package level_0;

class Solution35 {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n = i ; n <= j ; n++) {
        	String s = Integer.toString(n);
        	for(int m = 0; m < s.length(); m++) {
        		if(s.charAt(m) == Integer.toString(k).charAt(0)) answer++;
        	}
        }
        return answer;
    }
}

public class kÀÇ°³¼ö {
	public static void main(String []args) {
		int i = 10;
		int j = 50;
		int k = 5;
		
		Solution35 ob = new Solution35();
		System.out.println(ob.solution(i, j, k));
	}
}
