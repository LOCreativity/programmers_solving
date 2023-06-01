package level_0;

class Solution70 {
    public int solution(int price) {
        return price >= 500000 ? (int)(price * 0.8) : (price >= 300000 ? (int)(price * 0.9) : (price >= 100000 ? (int)(price * 0.95) : price));
    }
}

public class 옷가게할인받기 {
	public static void main(String []args) {
		int price = 150000;
		
		Solution70 ob = new Solution70();
		System.out.println(ob.solution(price));
	}
}
