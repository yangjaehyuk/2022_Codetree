package 프로그래밍_연습;

import java.util.Scanner;
import java.util.Arrays;

class Shake implements Comparable<Shake> {
	int time;
	int person1;
	int person2;

	public Shake(int time, int person1, int person2) {
		this.time = time;
		this.person1 = person1;
		this.person2 = person2;
	}

	@Override
	public int compareTo(Shake shake) {
		return time - shake.time;
	}
};

public class 악수와_전염병의_상관관계_2 {
	public static final int MAX_T = 250;
	public static final int MAX_N = 100;

	public static int n, k, p, t;
	public static int[] shakeNum = new int[MAX_N + 1];
	public static boolean[] infected = new boolean[MAX_N + 1];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		k = sc.nextInt();
		p = sc.nextInt();
		t = sc.nextInt();
		infected[p] = true;

		Shake[] shakes = new Shake[MAX_T];
		for (int i = 0; i < t; i++) {
			int time = sc.nextInt();
			int person1 = sc.nextInt();
			int person2 = sc.nextInt();
			shakes[i] = new Shake(time, person1, person2);
		}

			Arrays.sort(shakes, 0, t);

		for (int i = 0; i < t; i++) {
			int target1 = shakes[i].person1;
			int target2 = shakes[i].person2;
			if (infected[target1])
				shakeNum[target1]++;
			if (infected[target2])
				shakeNum[target2]++;
			if (shakeNum[target1] <= k && infected[target1])
				infected[target2] = true;

			if (shakeNum[target2] <= k && infected[target2])
				infected[target1] = true;
		}

		for (int i = 1; i <= n; i++) {
			if (infected[i])
				System.out.print(1);
			else
				System.out.print(0);
		}
	}

}
