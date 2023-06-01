package level_1;

import java.util.*;

class Solution14 {
    public String solution(String[] participant, String[] completion) {
        LinkedList<String> list = new LinkedList<String>(Arrays.asList(participant));
        
        list.sort(Comparator.naturalOrder()); //오름차순 정렬
        Arrays.sort(completion);
        for (int i = 0 ; i < completion.length ; i++) {
            if (list.get(0).equals(completion[i])) {
                list.remove(0);
            }
            else if (list.get(1).equals(completion[i])) {
                list.remove(1);
            }
        }  	
    	return list.get(0);
    }
}

public class 완주하지못한선수 {
	public static void main(String[] args) {
		String[] participant = {"kiki","kiki", "leo", "eden"};
		String[] completion = {"eden", "kiki"};
		
		Solution14 ob = new Solution14();
		System.out.println(ob.solution(participant, completion));
	}

}
