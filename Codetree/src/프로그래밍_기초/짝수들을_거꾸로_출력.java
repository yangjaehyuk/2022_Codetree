package 프로그래밍_기초;
import java.util.Scanner;

public class 짝수들을_거꾸로_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n+1];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
	}

}
