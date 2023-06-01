package level_0;

import java.util.Arrays;

class Solution68 {
    public int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length / 2];
    }
}

public class 중앙값구하기 {
	public static void main(String []args) {
		int[] array = {1, 3, 2, 4, 5};
		
		Solution68 ob = new Solution68();
		System.out.println(ob.solution(array));
	}
}
