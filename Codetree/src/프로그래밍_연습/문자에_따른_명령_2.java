package 프로그래밍_연습;

import java.util.Scanner;

public class 문자에_따른_명령_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int x=0,y=0;
		int[] dx=new int[] {1,0,-1,0};
		int[] dy=new int[] {0,-1,0,1};
		int dirNum = 3;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='R') {
				dirNum=(dirNum+1)%4;
			}
			else if(s.charAt(i)=='L') {
				dirNum=(dirNum-1+4)%4;
			}
			else {
				x+=dx[dirNum];
				y+=dy[dirNum];
			}
		}
		System.out.println(x+" "+y);
	}

}
