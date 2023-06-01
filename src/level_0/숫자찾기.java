package level_0;

class Solution45 {
    public int solution(int num, int k) {
        return Integer.toString(num).contains(Integer.toString(k)) ? Integer.toString(num).indexOf(Integer.toString(k)) + 1 : -1;
    }
}

public class 숫자찾기 {
	public static void main(String []args) {
		int num = 123456;
		int k = 7;
		
		Solution45 ob = new Solution45();
		System.out.println(ob.solution(num, k));
	}
}
