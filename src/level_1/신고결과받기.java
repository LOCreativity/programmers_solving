package level_1;

import java.util.*;
//곱창맛풍선껌님 코드를 보고 분석함
class Solution2 {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //신고당한 자의 HashMap을 구현한다.
        //신고당한 자는 신고한 자의 ID HashSet을 갖는다. key : 신고당한 사람, value : 신고한 사람들
        HashMap<String, HashSet<String>> reportedID = new HashMap<String, HashSet<String>>();
        
        //신고한 자의 id와 '처리 결과 메일 수신 카운트 배열' 인덱스 맵을 만든다.
        //key : 신고당한 사람, value : 신고당한 사람의 순서
        HashMap<String, Integer> idIndexMap = new HashMap<String, Integer>();
        for(int i = 0 ; i < id_list.length; i++) {
        	idIndexMap.put(id_list[i], i);
        }
        
        for(int i = 0 ; i < report.length; i++) {
        	String[] reportArr = report[i].split(" "); //신고한 사람, 신고당한 사람
        	//처음 신고당했을 경우
        	if(reportedID.get(reportArr[1]) == null) reportedID.put(reportArr[1], new HashSet<String>());
        	HashSet<String> set = reportedID.get(reportArr[1]); //신고한사람들 (value) 저장
        	set.add(reportArr[0]); //신고한사람 추가 (중복이면 추가 안함)
        	reportedID.put(reportArr[1], set); //신고당한 사람(key)의 값에 신고한 사람들 저장
        }
        
        //해당 유저를 신고한 모든 유저에게 정지 사실을 메일로 발송
        for(int i = 0 ; i < id_list.length; i++) {
        	Set<String> reporterID = reportedID.get(id_list[i]); //신고한 사람들
        	//신고한 사람이 존재하고 신고횟수가 k 이상일 경우
        	if(reporterID != null && reporterID.size() >= k) {
        		//신고한 사람들에게 +1
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

public class 신고결과받기 {
	public static void main(String []args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2;
		
		Solution2 ob = new Solution2();
		System.out.println(Arrays.toString(ob.solution(id_list, report, k)));
	}
}
