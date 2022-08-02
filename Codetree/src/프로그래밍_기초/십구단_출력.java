package 프로그래밍_기초;

public class 십구단_출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=19;i++) {
			for(int j=1;j<=19;j++) {
				if(j%2==0) {
					System.out.printf("/ %d * %d = %d",i,j,i*j);
					System.out.println();
				}
				else{
					if(j==19) {
						System.out.printf("%d * %d = %d ",i,j,i*j);
						System.out.println();
					}
					else
						System.out.printf("%d * %d = %d ",i,j,i*j);
				}
					
			}
		}
	}

}
