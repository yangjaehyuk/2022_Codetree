package 프로그래밍_기초;

public class 합을_복사하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2,c=3;
		int rst=a+b+c;
		a=b=c=rst;
		System.out.printf("%d %d %d",a,b,c);
	}

}
