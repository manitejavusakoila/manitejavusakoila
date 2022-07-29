package Assignment;

public class INeuronWord {

	public static void main(String[] args) {
		
		System.out.println();
		
		int n=7;
		
		for(int i=1;i<=n;i++) {
			//printing letter I
			
			for(int j=1;j<=n;j++) {
				if(i==1||j==(n+1)/2||i==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			// Printing letter N
			System.out.print(" ");
			for(int j=1;j<=n;j++) {
				if(j==1||i==j||j==n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.print(" ");
			//printing letter E
			for(int j=1;j<=n;j++) {
				if(i==1||j==1||i==n||i==(n+1)/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.print(" ");
			//printing letter U
			
			for(int j=1;j<=n;j++) {
				if(j==1&&i!=n || i==n&&j!=1&&j!=n||j==n&&i!=n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			System.out.print(" ");
			//printing letter R
			
			for(int j=1;j<=n;j++) {
				if(j==1||i==1|j==n&&i<=n/2||i==(n+2)/2||i==j&&i>=n/2+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			
			System.out.print("  ");
			
			//printing letter O
			for(int j=1;j<=n;j++) {
				if(i==1&&j!=1&&j!=n||j==1&&i!=1&&i!=n||j==n&&i!=1&&i!=n||i==n&&j!=n&&j!=1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			
			// Printing letter N
						System.out.print(" ");
						for(int j=1;j<=n;j++) {
							if(j==1||i==j||j==n)
								System.out.print("* ");
							else
								System.out.print("  ");
						}
			
			System.out.println();
		}
	}

}
