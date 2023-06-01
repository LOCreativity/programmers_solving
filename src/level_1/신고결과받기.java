package level_1;

import java.util.*;
//��â��ǳ������ �ڵ带 ���� �м���
class Solution2 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //�Ű���� ���� HashMap�� �����Ѵ�.
        //�Ű���� �ڴ� �Ű��� ���� ID HashSet�� ���´�. key : �Ű���� ���, value : �Ű��� �����
        HashMap<String, HashSet<String>> reportedID = new HashMap<String, HashSet<String>>();
        
        //�Ű��� ���� id�� 'ó�� ��� ���� ���� ī��Ʈ �迭' �ε��� ���� �����.
        //key : �Ű���� ���, value : �Ű���� ����� ����
        HashMap<String, Integer> idIndexMap = new HashMap<String, Integer>();
        for(int i = 0 ; i < id_list.length; i++) {
        	idIndexMap.put(id_list[i], i);
        }
        
        for(int i = 0 ; i < report.length; i++) {
        	String[] reportArr = report[i].split(" "); //�Ű��� ���, �Ű���� ���
        	//ó�� �Ű������ ���
        	if(reportedID.get(reportArr[1]) == null) reportedID.put(reportArr[1], new HashSet<String>());
        	HashSet<String> set = reportedID.get(reportArr[1]); //�Ű��ѻ���� (value) ����
        	set.add(reportArr[0]); //�Ű��ѻ�� �߰� (�ߺ��̸� �߰� ����)
        	reportedID.put(reportArr[1], set); //�Ű���� ���(key)�� ���� �Ű��� ����� ����
        }
        
        //�ش� ������ �Ű��� ��� �������� ���� ����� ���Ϸ� �߼�
        for(int i = 0 ; i < id_list.length; i++) {
        	Set<String> reporterID = reportedID.get(id_list[i]); //�Ű��� �����
        	//�Ű��� ����� �����ϰ� �Ű�Ƚ���� k �̻��� ���
        	if(reporterID != null && reporterID.size() >= k) {
        		//�Ű��� ����鿡�� +1
        		Iterator<String> iter = reporterID.iterator();
        		while(iter.hasNext()) {
        			String reporter = iter.next();
        			answer[idIndexMap.get(reporter)]++;
        		}
        	}
        }
        
        return answer;
    }
}

public class �Ű����ޱ� {
	public static void main(String []args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		Solution2 ob = new Solution2();
		System.out.println(Arrays.toString(ob.solution(id_list, report, k)));
	}
}
