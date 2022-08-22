package 프로그래밍_연습;

import java.util.Arrays;
import java.util.Scanner;
class score implements Comparable<score> {
	String name;
	int score_k;
	int score_e;
	int score_m;
	public score(String name, int score_k, int score_e, int score_m){
		this.name=name;
		this.score_k=score_k;
		this.score_e=score_e;
		this.score_m=score_m;
	}
	public int compareTo(score score) {
		if(this.score_k!=score.score_k) {
			return score.score_k-this.score_k;
		}
		if(this.score_e!=score.score_e) {
			return score.score_e-this.score_e;
		}
		
		return score.score_m-this.score_m;
	}
}
public class 국영수_순이지 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		score[] score=new score[n];
		for(int i=0;i<n;i++) {
			String name=sc.next();
			int score_k=sc.nextInt();
			int score_e=sc.nextInt();
			int score_m=sc.nextInt();
			score[i]=new score(name,score_k, score_e, score_m);
		}
		Arrays.sort(score);
		for(int i=0;i<n;i++) {
			System.out.println(score[i].name+" "+score[i].score_k+" "+score[i].score_e+" "+score[i].score_m);
		}
	}
}
