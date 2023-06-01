package level_0;

class Solution1 {
    public int solution(int[][] dots) {
        int answer = 0;
        for(int i = 0; i < dots.length - 1; i++) {
        	double line1, line2;
        	line1 = (double)Math.abs(dots[i][1] - dots[i+1][1])/Math.abs(dots[i][0] - dots[i+1][0]);
        	line2 = (double)Math.abs(dots[(i+2)%4][1] - dots[(i+3)%4][1])/Math.abs(dots[(i+2)%4][0] - dots[(i+3)%4][0]);
        	System.out.println(line1);
        	System.out.println(line2);
        	if(line1 == line2)
        		return ++answer;
        }
        return answer;
    }
}

public class dots {
	public static void main(String []args) {
		int [][] dots = {{3,5}, {4,1}, {2,4}, {5,10}};
		Solution1 ob = new Solution1();
		System.out.println(ob.solution(dots));
	}
}
