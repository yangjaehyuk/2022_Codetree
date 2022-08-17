package 프로그래밍_연습;

public class 별_찍는_것을_5번_반복하기 {
	public static void star() {
		for(int i=0;i<10;i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<5;i++) {
			star();
		}
	}

}
