package level_0;

class Solution31 {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(Integer.parseInt(bin1, 2) + Integer.parseInt(bin2, 2));
    }
}

public class 이진수더하기 {
	public static void main(String []args) {
		String bin1 = "10";
		String bin2 = "11";

		Solution31 ob = new Solution31();
		System.out.println(ob.solution(bin1, bin2));
	}
}
