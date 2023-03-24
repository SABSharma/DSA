package BasicP;

public class TrailingZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		int res=0;
		for (int i=5; i<=n; i=i*5 ) {
			 res=res+n/i;
		}
		System.out.println("number of zeros" + res);

	}

}
