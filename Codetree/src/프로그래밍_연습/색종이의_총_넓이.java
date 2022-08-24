package 프로그래밍_연습;

import java.util.Scanner;

public class 색종이의_총_넓이 {
	public static final int MAX_N = 100;
    public static final int MAX_R = 200;
    public static final int OFFSET = 100;

    public static int n;
    public static int[] x1 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] y2 = new int[MAX_N];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(int i=0;i<n;i++) {
			x1[i]=sc.nextInt();
			y1[i]=sc.nextInt();
			x2[i]=x1[i]+8;
			y2[i]=y1[i]+8;
			x1[i]+=OFFSET;
			y1[i]+=OFFSET;
			x2[i]+=OFFSET;
			y2[i]+=OFFSET;
		}
		for(int i = 0; i < n; i++)
            for(int x = x1[i]; x < x2[i]; x++)
                for(int y = y1[i]; y < y2[i]; y++)
                    checked[x][y]=1;
		int area = 0;
        for(int x = 0; x <= MAX_R; x++)
            for(int y = 0; y <= MAX_R; y++)
                if(checked[x][y]>0)
                    area++;
        System.out.println(area);
		}
		
	
}
