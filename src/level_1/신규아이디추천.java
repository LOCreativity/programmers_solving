package level_1;

/*
1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
     ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
 */

class Solution9 {
    public String solution(String new_id) {
    	//1�ܰ�
    	new_id = new_id.toLowerCase();

    	//2�ܰ�
        new_id = new_id.replaceAll("[^a-z0-9-_.]", "");

        //3�ܰ�
        new_id = new_id.replaceAll("[.]{2,}", ".");

        //4�ܰ�
        new_id = new_id.replaceAll("^[.]", "");
        new_id = new_id.replaceAll("[.]$", "");

        //5�ܰ�
        if(new_id.length() == 0) new_id = "a";

        //6�ܰ�
        if(new_id.length() > 15) new_id = new_id.substring(0, 15);
        
        //7�ܰ�
        if(new_id.length() <= 2) {
        	while(new_id.length() != 3) {
        		new_id += new_id.charAt(new_id.length() - 1);
        	}
        }
        new_id = new_id.replaceAll("[.]$", "");
        
    	return new_id;
    }
}

public class �űԾ��̵���õ {
	public static void main(String []args) {
		String new_id = "abcdefghijklmn.p";
		
		Solution9 ob = new Solution9();
		System.out.println(ob.solution(new_id));
	}
}
