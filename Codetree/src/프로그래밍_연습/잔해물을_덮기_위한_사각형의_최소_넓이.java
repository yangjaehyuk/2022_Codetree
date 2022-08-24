package 프로그래밍_연습;

import java.util.Scanner;

public class 잔해물을_덮기_위한_사각형의_최소_넓이 {
	public static final int MAX_N = 1000;
    public static final int MAX_R = 2000;
    public static final int OFFSET = 1000;

    public static int n=2;
    public static int[] x1 = new int[MAX_N];
    public static int[] y1 = new int[MAX_N];
    public static int[] x2 = new int[MAX_N];
    public static int[] y2 = new int[MAX_N];

    public static int[][] checked = new int[MAX_R + 1][MAX_R + 1];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<n;i++) {
			x1[i]=sc.nextInt();
			y1[i]=sc.nextInt();
			x2[i]=sc.nextInt();
			y2[i]=sc.nextInt();
			x1[i]+=OFFSET;
			y1[i]+=OFFSET;
			x2[i]+=OFFSET;
			y2[i]+=OFFSET;
		}
		for(int i = 0; i < n; i++)
            for(int x = x1[i]; x < x2[i]; x++)
                for(int y = y1[i]; y < y2[i]; y++)
                    checked[x][y]=i+1;
		int minX = MAX_R, maxX = 0, minY = MAX_R, maxY = 0;
        boolean firstRectExist = false;
        for(int x = 0; x <= MAX_R; x++)
            for(int y = 0; y <= MAX_R; y++)
                if(checked[x][y] == 1) {
                    firstRectExist = true;
                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }
        int area;
        if(!firstRectExist)
            area = 0;
        else
            area = (maxX - minX + 1) * (maxY - minY + 1);
        System.out.print(area);
	}

}
