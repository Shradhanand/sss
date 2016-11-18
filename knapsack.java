import java.util.Scanner;


public class knapsack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ss=new Scanner(System.in);
		int t=ss.nextInt();
		while(t-->0){
			long n=ss.nextLong();
			if(isPower(n))
				System.out.println(n-1);
			else{
				int count=0;
				for(long i=1;i<n;i++)
					if((i^n)==i+n){
						//if((i&n)==0){

						count++;
						System.out.println(i);
					}
				System.out.println(count);
			}
		}
	}

	private static boolean isPower(long n) {
		return ((n & (n - 1)) == 0);
	}
}
