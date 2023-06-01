package level_0;

class Solution10 {
    public String solution(String polynomial) {
    	String answer = "";
        int []sum = new int[2];
        String sum0 = "x";
        String []str = polynomial.split(" ");
        
        for(int i = 0; i < str.length; i+=2) {
        	if(str[i].contains("x")) {
        		if(str[i].equals("x"))sum[0]++;
        		else sum[0] += Integer.parseInt(str[i].split("x")[0]);
        	}
        	else sum[1]+= Integer.parseInt(str[i]);
        }
        
        if(sum[0] == 0) answer = Integer.toString(sum[1]);
        else if(sum[1] == 0) {
        	if(sum[0] == 1) return "x";
        	answer = Integer.toString(sum[0]) + "x";
        }
        else {
        	if(sum[0] == 1) return "x + " + Integer.toString(sum[1]);
        	answer = Integer.toString(sum[0]) + "x" + " + " + Integer.toString(sum[1]);
        }
        
        return answer;
    }
}

public class 다항식더하기 {
	public static void main(String []args) {
		String polynomial = "3 + x";
		
		Solution10 ob = new Solution10();
		System.out.println(ob.solution(polynomial));
	}
}
