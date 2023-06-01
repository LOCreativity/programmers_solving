package level_0;

class Solution2{
	public int solution(int [][] lines) {
		// 1. arr �迭 �� ���� �ʱ�ȭ
        int[] arr = new int[200];
        int answer = 0;
        
        // 2. lines ������ arr �迭�� ����
        for(int i = 0; i < lines.length; i++)
            for(int j = lines[i][0] + 100; j < lines[i][1] + 100; j++)
                arr[j]++;
        
        // 3. arr �迭���� ��ģ �κ� ����
        for(int i = 0; i < 200; i++)
            if(arr[i] > 1)
                answer++;
        
        return answer;
	}
}

public class lines {
	public static void main(String []args) {
		int [][] lines = {{-3,-1}, {-2,1}, {0, 2}};
		Solution2 ob = new Solution2();
		System.out.println(ob.solution(lines));
	}
}
