package level_0;

import java.util.Scanner;
//56��°
public class �����ﰢ������ϱ� {
	public static void main(String []args) {
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     
	     for(int i = 1 ; i <= n; i++) {
	    	 for(int j = 1; j <= i; j++) {
	    		 System.out.print("*");
	    	 }
	    	 System.out.println();
	     }
	}
}
