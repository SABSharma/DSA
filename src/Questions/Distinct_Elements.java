package Questions;

import java.util.HashMap;

public class Distinct_Elements {

	public static void main(String[] args) {
		// Find the Distinct Elements in every Counter of K
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,2,1,3,1,1,3};
		int k=4;
		
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		for(int i=0; i<k; i++) {
			
			map.put(arr[i] , map.getOrDefault(arr[i], 0) + 1);
		}
		System.out.println(map.size());
		
		for(int i=k; i<arr.length; i++) {
			if(map.get(arr[i-k])==1) {
				map.remove(arr[i-k]);
			}
			else {
				map.put(arr[i-k], map.get(arr[i-k])-1 );
			}
			map.put(arr[i], map.getOrDefault(arr[i], 0) +1);
			System.out.println(map.size());
			
			
		}
		

	}
	
	

}
