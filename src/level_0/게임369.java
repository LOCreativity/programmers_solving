package level_0;

class Solution44 {
    public int solution(int order) {
        int answer = 0;
        String s = Integer.toString(order);
        for(int i = 0 ; i < s.length(); i++) {
        	int num = Integer.parseInt(String.valueOf(s.charAt(i)));
        	if(num % 3 == 0 && num != 0) answer++;
        }
        return answer;
    }
}

public class °ÔÀÓ369 {
	public static void main(String []args) {
		int order = 0;
		
		Solution44 ob = new Solution44();
		System.out.println(ob.solution(order));
	}
}
