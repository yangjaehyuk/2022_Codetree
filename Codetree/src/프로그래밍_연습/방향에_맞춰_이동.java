package 프로그래밍_연습;

import java.util.Scanner;

public class 방향에_맞춰_이동 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dx = new int[] { 0, 0, -1, 1 };
		int[] dy = new int[] { -1, 1, 0, 0 };
		int nx = 0, ny = 0;
		int x = 0;
		int y = 0;
		for (int i = 0; i < n; i++) {
			char d = sc.next().charAt(0);
			int s = sc.nextInt();
			if (d == 'W') {
				nx += (x + dx[2]) * s;
				ny += (y + dy[2]) * s;

			} else if (d == 'E') {
				
					nx += (x + dx[3]) * s;
					ny += (y + dy[3]) * s;

				
			} else if (d == 'N') {
				
					nx += (x + dx[1]) * s;
					ny += (y + dy[1]) * s;

				
			} else {
				
					nx += (x + dx[0]) * s;
					ny += (y + dy[0]) * s;

				
			}
		}
		System.out.println(nx + " " + ny);
	}

}
