package 프로그래밍_기초;

public class 데이터_교환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=5;
		int b=6;
		int c=7;
		int temp1;
		temp1=c;
		c=b;
		b=a;
		a=temp1;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
