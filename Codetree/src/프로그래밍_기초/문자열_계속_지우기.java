package 프로그래밍_기초;

import java.util.Scanner;

public class 문자열_계속_지우기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int alen=a.length();
		int blen=b.length();
		while(true) {
			int idx=-1;
			int c=alen-blen+1;
			for(int i=0;i<c;i++) {
				boolean same=true;
				for(int j=0;j<blen;j++) {
					if(a.charAt(i+j)!=b.charAt(j)) {
						same=false;
						break;
					}
				}
				if(same) {
					idx=i;
					break;
				}
			}
			if(idx==-1) {
				break;
			}
			a=a.substring(0, idx)+a.substring(idx+blen);
			alen=a.length();
		}
		System.out.println(a);
	}

}
