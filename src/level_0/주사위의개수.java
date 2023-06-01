package level_0;

class Solution53 {
    public int solution(int[] box, int n) {
        return (box[0] / n) * (box[1] / n)  * (box[2] / n);
    }
}

public class 주사위의개수 {
	public static void main(String []args) {
		int[] box = {1, 1, 1};
		int n = 1;
		
		Solution53 ob = new Solution53();
		System.out.println(ob.solution(box, n));
	}
}
