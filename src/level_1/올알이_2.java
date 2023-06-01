package level_1;

class Solution12 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] able = {"aya", "ye", "woo", "ma"};
        
        for(int i = 0; i < babbling.length; i++) {
        	for(int j = 0; j < able.length; j++) {
        		if(babbling[i].contains("ayaaya") || babbling[i].contains("yeye")
        				|| babbling[i].contains("woowoo") || babbling[i].contains("mama")) break;
        		babbling[i] = babbling[i].replace(able[j], "-");
        	}
        	babbling[i] = babbling[i].replace("-", "");
        	if(babbling[i].equals("")) answer++;
        }
        return answer;
    }
}

public class ¿Ã¾ËÀÌ_2 {
	public static void main(String []args) {
		String[] babbling = {"aya", "yee", "u", "maa"};
		
		Solution12 ob = new Solution12();
		System.out.println(ob.solution(babbling));
	}
}
