package 프로그래밍_기초;

import java.util.Scanner;

public class 정수만_추출하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int idxa=0;
		int idxb=0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)>='0' && a.charAt(i)<='9') {
				idxa++;
			}
			else
				break;
		}
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)>='0' && b.charAt(i)<='9') {
				idxb++;
			}
			else
				break;
		}
		String str1=a.substring(0,idxa);
		String str2=b.substring(0,idxb);
		int str1Int=Integer.parseInt(str1);
		int str2Int=Integer.parseInt(str2);
		System.out.println(str1Int+str2Int);
	}

}
