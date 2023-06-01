package level_0;

class Solution21 {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for(int i = 0; i < dic.length; i++) {
        	for(int j = 0; j < spell.length; j++) {
        		if(dic[i].contains(spell[j])) dic[i] = dic[i].replace(spell[j], "");
        		else dic[i] += "1";
        	}
        	if(dic[i].equals("")) {
        		System.out.println(i);
        		return 1;
        	}
        }
        return answer;
    }
}

public class 외계어사전 {
	public static void main(String []args) {
		String[] spell = {"p", "o", "s"};
		String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
		
		Solution21 ob = new Solution21();
		System.out.println(ob.solution(spell, dic));
	}
}
