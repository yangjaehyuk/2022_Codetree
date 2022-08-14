package 프로그래밍_기초;

import java.util.Scanner;

public class 첫_번째와_두_번째_교환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.next();
		char a = str.charAt(0);
        char b = str.charAt(1);
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == a)
                str = str.substring(0, i) + b + str.substring(i + 1);
            else if(str.charAt(i) == b)
                str = str.substring(0, i) + a + str.substring(i + 1);
        }
		System.out.println(str);
	}

}
