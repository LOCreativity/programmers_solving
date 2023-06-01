package level_1;

import java.util.ArrayList;
import java.util.Arrays;

class Solution1 {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<Integer>();
        
        for(int i = 0 ; i < privacies.length; i++) {
        	privacies[i] = privacies[i].replace(".", " ");
        	String[] pri_str = privacies[i].split(" ");
        	int month = 0;
        	//��ȿ�Ⱓ �˻�
        	for(int j = 0; j < terms.length; j++) {
        		if(terms[j].contains(pri_str[3])) {
        			String[] termsArr = terms[j].split(" ");
        			month = Integer.parseInt(termsArr[1]);
        		}
        	}
        	//�������� ���� ������
        	pri_str[2] = (Integer.parseInt(pri_str[2]) - 1) + "";
        	if(Integer.parseInt(pri_str[2]) == 0) {
        		pri_str[2] = "28";
        		pri_str[1] = (Integer.parseInt(pri_str[1]) - 1) + "";
        		if(Integer.parseInt(pri_str[1]) == 0) pri_str[0] = (Integer.parseInt(pri_str[0]) - 1) + "";
        	}
        	pri_str[1] = (Integer.parseInt(pri_str[1]) + month) + "";
        	if(Integer.parseInt(pri_str[1]) > 12) {
        		int year = Integer.parseInt(pri_str[1]) / 12;
        		pri_str[1] = (Integer.parseInt(pri_str[1]) % 12) + "";
        		if(pri_str[1].equals("0")) {
        			pri_str[1] = "12";
        			year--;
        		}
        		pri_str[0] = (Integer.parseInt(pri_str[0]) + year) + "";
        	}
        	//0���̱�
        	if(pri_str[1].length() <= 1) pri_str[1] = "0" + pri_str[1];
        	if(pri_str[2].length() <= 1) pri_str[2] = "0" + pri_str[2];
        	//��
        	if(Integer.parseInt(today.replace(".", "")) > Integer.parseInt(pri_str[0] + pri_str[1] + pri_str[2]))
        		answer.add(i + 1);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}

public class ��������������ȿ�Ⱓ {
	public static void main(String []args) {
		String today = "2020.01.01";
		String[] terms = {"Z 3", "D 5"};
		String[] privacies = {"2019.01.01 D", "2019.11.15 Z", "2019.08.02 D", "2019.07.01 D", "2018.12.28 Z"};
		
		Solution1 ob = new Solution1();
		System.out.println(Arrays.toString(ob.solution(today, terms, privacies)));
	
		//System.out.println(Integer.parseInt(a));
	}
}
