package BasicP;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num=1213;
        int rev=0;
        int temp=num;
        while(num>0) {
        	rev= rev*10 +num%10;
        	num=num/10;
        }
        if ( temp == rev)
           System.out.println("Palindrome number");
        else
        	System.out.println("Not Palindrome number" );
	}

}
