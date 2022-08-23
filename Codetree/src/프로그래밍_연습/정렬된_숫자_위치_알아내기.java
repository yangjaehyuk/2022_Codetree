package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;
class number implements Comparable<number>{
	int num;
	int idx;
	public number(int num, int idx) {
		this.num=num;
		this.idx=idx;
	}
	public int compareTo(number number) {
		if(num!=number.num)
			return this.num-number.num;
		return this.idx-number.idx;
	}
}
public class 정렬된_숫자_위치_알아내기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] rst=new int[1000];
		number[] number=new number[n];
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			number[i]=new number(num, i);
		}
		Arrays.sort(number,0,n);
		for(int i=0;i<n;i++) {
			rst[number[i].idx]=i+1;
		}
		for(int i=0;i<n;i++) {
			System.out.print(rst[i]+" ");
		}
	}

}
