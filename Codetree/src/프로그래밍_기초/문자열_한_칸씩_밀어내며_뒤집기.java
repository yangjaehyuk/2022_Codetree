package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_한_칸씩_밀어내며_뒤집기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int q=sc.nextInt();
		int slen=s.length();
		for(int i=0;i<q;i++) {
			int n=sc.nextInt();
			if(n==1) {
                char[] arr = s.toCharArray();

                char front = arr[0];             
                for(int j = 1; j < slen; j++) 
                    arr[j - 1] = arr[j];
                arr[slen - 1] = front;   

                s = new String(arr);
                System.out.println(s);
            }
            else if(n == 2) {
                char[] arr = s.toCharArray();

                char back = arr[slen - 1];          
                for(int j = slen - 1; j >= 1; j--)  
                    arr[j] = arr[j - 1];    
                arr[0] = back;					    

                s = new String(arr);
                System.out.println(s);
            }
            else if(n == 3) {
                char[] arr = s.toCharArray();

                char temp;
                for(int j = 0; j < slen / 2; j++) {
                    temp = arr[j];
                    arr[j] = arr[slen - j - 1];
                    arr[slen - j - 1] = temp;
                }

                s = new String(arr);
                System.out.println(s);
			}
		}
	}

}
