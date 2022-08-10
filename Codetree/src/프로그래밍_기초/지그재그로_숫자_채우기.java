package 프로그래밍_기초;

import java.util.Scanner;

public class 지그재그로_숫자_채우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	     int n = sc.nextInt();
	     int m = sc.nextInt();
	     int[][] arr = new int[n][m];
	     int count = 0;
	     for(int col = 0; col < m; col++) {
	    	 if (col % 2 == 0) {
	    		 for(int row = 0; row < n; row++){
	    			 arr[row][col] = count;
	                 count++;
	               }
	            }
	         else {
	        	 for(int row = n - 1; row >= 0; row--){
	        		 arr[row][col] = count;
	        		 count++;
	                }
	            }
	        }
	        for(int row = 0; row < n; row++) {
	            for(int col = 0; col < m; col++) {
	                System.out.print(arr[row][col] + " ");
	            }
	            System.out.println();
		}
	}

}
