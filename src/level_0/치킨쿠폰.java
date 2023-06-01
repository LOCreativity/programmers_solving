package level_0;

class Solution16 {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;
        int additional = 0;
        
        while(true) {
        	if(coupon / 10 >= 1) {
            	additional += coupon / 10;
            	coupon = (coupon % 10) + additional;
            	answer += additional;
            }else break;

            additional = 0;
        }   
        return answer;
    }
}

public class Ä¡Å²ÄíÆù {
	public static void main(String []args) {
		int chicken = 1081;
		
		Solution16 ob = new Solution16();
		System.out.println(ob.solution(chicken));
	}
}
