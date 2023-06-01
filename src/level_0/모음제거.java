package level_0;

class Solution62 {
    public String solution(String my_string) {
        return my_string.replaceAll("a|e|i|o|u", "");
    }
}

public class 모음제거 {
	public static void main(String []args) {
		String my_string = "bus";
		
		Solution62 ob = new Solution62();
		System.out.println(ob.solution(my_string));
	}
}
