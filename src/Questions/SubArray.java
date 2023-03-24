package Questions;

import java.util.*;
public class SubArray {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find the subarray Which contains the Sum = K
		
		int arr[] = {10,15,-5,15,-15};
		int sum=5;
		SubArray ob = new SubArray();
		 System.out.print(ob.subarray(arr, sum) );
		
	
	}
	
	 public  ArrayList<Integer> subarray(int a[] , int sum ){
			
			ArrayList <Integer> al= new ArrayList<Integer>();
			HashMap<Integer , Integer> map= new HashMap<Integer,Integer>();
			int start=0;
			int cursum=0;
			int end =-1;
			
			for(int i=0; i<a.length; i++) {
				cursum +=a[i];
				if(cursum == sum) {
					start=0;
					end=i;
					al.add(start) ; al.add(end);
					return al;
				}
				
				if( map.containsKey(cursum-sum) ) {
					start=map.get(cursum-sum) +1;
					end=i;
					al.add(start);
					al.add(end);
					return al;
				}
				map.put(cursum, i );
				
			}
			
			return  al;
		}
	
	
	

}
