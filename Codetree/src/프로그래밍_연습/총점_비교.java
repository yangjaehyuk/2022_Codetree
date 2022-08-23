package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;
class student implements Comparable<student>{
	String name;
	int score1;
	int score2;
	int score3;
	public student(String name, int score1, int score2, int score3) {
		this.name=name;
		this.score1=score1;
		this.score2=score2;
		this.score3=score3;
	}
	public int compareTo(student student) {
		return (this.score1+this.score2+this.score3)-(student.score1+student.score2+student.score3);
	}
}
public class 총점_비교 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		student[] student=new student[n];
		for(int i=0;i<n;i++) {
			String name=sc.next();
			int score1=sc.nextInt();
			int score2=sc.nextInt();
			int score3=sc.nextInt();
			student[i]=new student(name,score1,score2,score3);
		}
		Arrays.sort(student);
		for(int i=0;i<n;i++) {
			System.out.println(student[i].name+" "+student[i].score1+" "+student[i].score2+" "+student[i].score3);
		}
	}

}
