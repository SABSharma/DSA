package ArrayDsa;

public class Stocks_Sell_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {100,180,260,310,40,535,695} ;
	       int value= profit(arr1);
	       System.out.println("value=:  "+value);
	}
     public static int profit( int arr[]) {
    	 int maxprofit=0;
    	 int minvalue=arr[0];
    	 
    	 for ( int i=0; i<arr.length; i++) {
    		 if (arr[i]<minvalue) {
                 minvalue=arr[i];
    		 }
    		 int currprofit=arr[i]-minvalue;
    		 if (currprofit>maxprofit)
    		    maxprofit=currprofit;
    	 }
    	 return maxprofit;
     }
}
