package Questions;

import java.util.PriorityQueue;

public class MinimumCostOfRopes_34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,4,8,6,9};
		System.out.println(minimumCost(arr));

	}
	public static int minimumCost(int a[] ) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		for(int i=0; i<a.length; i++) {
			pq.add(a[i]);
		}
		int cost=0;
		
		while(pq.size()>1) {
			int first=pq.poll();
			int second=pq.poll();
			int sum=first+second;
			cost+=sum;
			pq.add(sum);	
		}
		
		return cost;
	}

}
