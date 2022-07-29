package Assignment;

public class PatternProgram3 {

	public static void main(String[] args) {
		
		int n=14;
		
//				if(i==(n+1)/2||j==1)
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==1&&j<=n/2||j==1||j==n||i==n||i+j<=n/2+1||j-i>=(n)/2-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
