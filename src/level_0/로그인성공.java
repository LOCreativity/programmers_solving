package level_0;

class Solution17 {
    public String solution(String[] id_pw, String[][] db) {
        for(int i = 0; i < db.length; i++) {
        	if(id_pw[0].equals(db[i][0])){
        		if(id_pw[1].equals(db[i][1])) return "login";
        		else return "wrong pw";
        	}
        }    
        return "fail";
    }
}

public class 로그인성공 {
	public static void main(String []args) {
		String[] id_pw = {"meosseugi", "1234"};
		String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};
		
		Solution17 ob = new Solution17();
		System.out.println(ob.solution(id_pw, db));
 	}
}
