package questions_2;

import java.util.Stack;

public class Stack_to_Queue {
	Stack<Integer> s1 = new Stack<>();
	Stack<Integer> s2 = new Stack<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //180030009009
		
		// 121@.in.airtel.com
		Stack_to_Queue ob = new Stack_to_Queue();
		int arr[]= {3,5,3};
		//int[] smaller_Left = smaller_left(arr);

		for(int i=0; i<arr.length; i++) {
		      ob.push(arr[i]);
		}
		int pop = ob.pop();
		System.out.println(pop);
	}
	
	public   void push(int a) {
		s1.push(a);
		
	}
	
	public int pop() {
		while(!s1.isEmpty()) {
			s2.push(s1.pop());
		}
		int res=s2.pop();
		while(!s2.isEmpty()){
			s1.push(s2.pop());
		}
		return res;
	}
	
	

}
