package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;

public class k번째로_신기한_문자열 {

	public static int n, k;
    public static String t;
    public static int cnt;
    
    public static String[] str = new String[1000];
    public static String[] words = new String[1000];
    public static boolean startsWith(String a, String b) {
       
        if((int) a.length() < (int) b.length())
            return false;
        for(int i = 0; i < (int) b.length(); i++)
            if(a.charAt(i) != b.charAt(i))
                return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        t = sc.next();
        for(int i = 0; i < n; i++) {
            str[i] = sc.next();
            
            if(startsWith(str[i], t))
                words[cnt++] = str[i];
        }
        
        Arrays.sort(words, 0, cnt);
        
        System.out.print(words[k - 1]);
    }

}
