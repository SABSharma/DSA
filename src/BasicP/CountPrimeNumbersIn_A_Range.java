package BasicP;

import java.util.Arrays;

public class CountPrimeNumbersIn_A_Range {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountPrimeNumbersIn_A_Range ob = new CountPrimeNumbersIn_A_Range();
		//ob.countPrime(12);
		  boolean prime[]= countPrime(12);
		
		for(int i=0; i< prime.length ; i++) {
			System.out.println(i +" "+ prime[i]);
		}

	}
	public static  boolean [] countPrime( int n) {
		boolean isPrime[]= new boolean [n+1];
		
		Arrays.fill(isPrime, true);
		isPrime[0]=false;
		isPrime[1]=false;
		for (int i=2; i*i<=n; i++) {
			for (int j=i*2; j<=n; j=j+i ) {
				isPrime[j]=false;
				
			
			}
		}
		
		return isPrime; 
	}

}
