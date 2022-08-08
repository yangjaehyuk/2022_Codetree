package 프로그래밍_기초;

import java.util.Scanner;

public class 중복되지_않는_숫자_중_최대 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n;
        int[] nums = new int[1000];

        n = sc.nextInt();
        for(int i = 0; i < n; i++)
            nums[i] = sc.nextInt();

        int max = -1;
        for(int i = 0; i < n; i++) {
            int currNum = nums[i];
            if(max < currNum) {
                int count = 0;
                for(int j = 0; j < n; j++) {
                    if(nums[j] == currNum) {
                        count++;
                    }
                }
                if(count == 1) {
                    max = currNum;
                }
            }
        }
        System.out.print(max);
	}

}
