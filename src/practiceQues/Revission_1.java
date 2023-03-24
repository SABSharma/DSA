package practiceQues;

import java.util.HashMap;
import java.util.Map;

public class Revission_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {3,5,9,12};
		 System.out.println(majorityElement(arr));
		 System.out.println("Largest Sum="+ LargestSum(arr));
         System.out.println("maximum Profit" + maximumProfit(arr));
         System.out.println("All Profit =" + allProfit(arr));
         System.out.println("mid element = : "+ binarysearch(arr, 6));
         givensum(arr, 8);
	}
	
	public  static int majorityElement(int[] a) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int count=0;
		for(int i=0; i<a.length; i++) {
			if(hm.containsKey(a[i]))
				hm.put(a[i], hm.get(a[i]) +1);
			else
				hm.put(a[i], 1);
		}
		
		int KEY=0;
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			//System.out.println(entry.getKey() +"="+entry.getValue());
			if(entry.getValue() > count) {
				count=entry.getValue();
				KEY =entry.getKey();
			}
			
		}	
		
		return KEY;
	}
	
	// NEw Function 
	public static int LargestSum(int a[]) {
		int cursum=0;
		int finalsum=0;
		for(int i=0; i<a.length; i++) {
			cursum +=a[i];
			if(cursum>finalsum)
				finalsum=cursum;
			if(cursum<= 0)
				cursum=0;
		}
		
		return finalsum;
	}
	
	// Maximum  Profit 
	public static int  maximumProfit(int a[]) {
		int minsofar=a[0];
		int maxprofit=0;
		for(int i=0; i<a.length; i++ ) {
			if(a[i]<minsofar) {
				minsofar=a[i];
			}
			int curprofit=a[i]-minsofar;
			if(curprofit>maxprofit)
				maxprofit=curprofit;
		}
		return maxprofit;
	}
    
	// Stack Buy and sell -2
	public static int allProfit(int a[]) {
		int profit=0;
		for(int i=1; i<a.length; i++) {
			if(a[i]>a[i-1]) {
				profit=profit+( a[i] -a[i-1]);
			}
		}
		
		return profit;
	}
	
	//Binary Search 
	public static int binarysearch(int a[] , int find) {
		int start=0;
		int end=a.length-1;
		while(start<=end) {
			int mid=(start+end)/2; 
			if(a[mid]==find)
				return a[mid];
			else if(find>mid) {
				start=mid+1;
				
			}
			else
				end=mid-1;
		}
		
		return -1;
	}
	
	//Subarray with the given Sum
	public static int [] givensum(int a[] , int sum) {
		int arr[] = new int[5];
		int cursum=0;
		int start=0;
		int end=-1;
		HashMap<Integer, Integer> hm= new HashMap();
		for (int i=0 ; i<a.length; i++) {
			cursum+=a[i];
			if(cursum-sum==0) {
				start=0;end=i;
				break;
			}
			if( hm.containsKey(cursum-sum) ) {
				start=hm.get(cursum-sum) +1;
				end=i;
			}
			hm.put(cursum, i);
		}
		System.out.println("start="+start +" , End="+ end);
		arr[0]=start;
		arr[1]=end;
		return arr;
		
	}
}
