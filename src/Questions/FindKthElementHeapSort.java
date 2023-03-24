package Questions;
import java.util.*;
public class FindKthElementHeapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,5,6,4};
		FindKthElementHeapSort ob =new FindKthElementHeapSort();
        System.out.println(ob.lagest_Kth_Eelemt(arr,3));
	}
	
	public int lagest_Kth_Eelemt(int a[] , int k) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i=0; i<k; i++) {
			pq.add(a[i]);
		}
		
		for(int i=k; i<a.length;i++) {
			if(pq.peek()<a[i]) {
				pq.poll();
				pq.add(a[i]);
			}
		}
		
//		----Another Way of doing this----
//		Arrays.sort(a);
//		return a[a.length-k];
		return pq.peek();
	} 

}
