package level_0;

class Solution65 {
    public int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}

public class 문자열안에문자열 {
	public static void main(String []args) {
		String str1 = "ab6CDE443fgh22iJKlmn1o";
		String str2 = "6CD";
		
		Solution65 ob = new Solution65();
		System.out.println(ob.solution(str1, str2));
	}
}
