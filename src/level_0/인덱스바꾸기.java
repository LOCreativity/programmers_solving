package level_0;

class Solution47 {
    public String solution(String my_string, int num1, int num2) {
        char[] arr = my_string.toCharArray();
        char temp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = temp;
        return String.valueOf(arr);
    }
}

public class 인덱스바꾸기 {
	public static void main(String []args) {
		String my_string = "hello";
		int num1 = 1;
		int num2 = 2;
		
		Solution47 ob = new Solution47();
		System.out.println(ob.solution(my_string, num1, num2));
	}
}
