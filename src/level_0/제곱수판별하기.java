package level_0;

class Solution64 {
    public int solution(int n) {
        return (int)Math.pow((int)Math.sqrt(n), 2) == n ? 1 : 2; 
    }
}

public class �������Ǻ��ϱ� {
	public static void main(String []args) {
		int n = 144;
		
		Solution64 ob = new Solution64();
		System.out.println(ob.solution(n));
	}
}
