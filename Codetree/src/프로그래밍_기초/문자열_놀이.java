package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_놀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		int q=sc.nextInt();
	    int len = str.length();
        for(int i = 0; i < q; i++) {
            int qType = sc.nextInt();
            
            if(qType == 1) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                char tmp = str.charAt(a - 1);
                
                str = str.substring(0, a - 1) + str.charAt(b - 1) + str.substring(a);
                
                str = str.substring(0, b - 1) + tmp + str.substring(b);

                System.out.println(str);
            }
            else {
                char a = sc.next().charAt(0);
                char b = sc.next().charAt(0);
                
                for(int j = 0; j < len; j++)
                    if(str.charAt(j) == a)
                        str = str.substring(0, j) + b + str.substring(j + 1);
                
                System.out.println(str);
            }
        }
	}

}
