package 프로그래밍_연습;

import java.util.Scanner;
class user{
	char codename;
	int score;
	public user(char codename, int score){
		this.codename=codename;
		this.score=score;
	}
}
public class 코드네임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		user[] user=new user[5];
		for(int i=0;i<5;i++) {
			char codename=sc.next().charAt(0);
			int score=sc.nextInt();
			user[i]=new user(codename, score);
		}
		int min=0;
		for(int i=0;i<user.length;i++) {
			if(user[min].score>user[i].score) {
				min=i;
			}
		}
		System.out.println(user[min].codename+" "+user[min].score);
	}

}
