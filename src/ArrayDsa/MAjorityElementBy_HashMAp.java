package ArrayDsa;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class MAjorityElementBy_HashMAp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,1,5,1 ,5,6,5,5} ;
	       int value= Majority(arr1);
	       System.out.println("value=:  "+value);
	}
    
	public static int Majority(int [] arr) {
		HashMap<Integer, Integer> hashmap= new HashMap<Integer, Integer>();
		for (int i=0; i<arr.length; i++) {
			if (hashmap.containsKey(arr[i])) {
				hashmap.put(arr[i], hashmap.get(arr[i])+1 );
			}
			else
				hashmap.put(arr[i], 1);
			
		}
		
//		Collection<Integer> values= hashmap.values();
//		Iterator i = values.iterator();
		int  max=0;
//		while(i.hasNext()) {
//			
//		}
		hashmap.entrySet().forEach(entry -> {
		    System.out.println(entry.getKey() + " " + entry.getValue());
//		    if(entry.getValue() > max) {
//		    	max = 5;
//		    }
		});
		
		return 5;
	}
}
