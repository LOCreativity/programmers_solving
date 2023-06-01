package level_0;

class Solution9 {
    public int solution(int[] array) {
        int answer = 0;
        int []arrayNum = new int[1000];
        int max = 0;

        for(int i = 0; i < array.length; i++)
        	arrayNum[array[i]]++;
        
        for(int i = 0; i < arrayNum.length; i++) {
        	if(arrayNum[i] >= max) {
        		if(arrayNum[i] == max) {
        			answer = -1;
        		}
        		else {
        			max = arrayNum[i];
        			answer = i;
        		}
        	}
        }
        //map.getOrDefault(number, 0) + 1; --> HashMap
        return answer;
    }
}

public class 최빈값구하기 {
	public static void main(String []args) {
		int []array = {1};
		
		Solution9 ob = new Solution9();
		System.out.println(ob.solution(array));
	}
}
