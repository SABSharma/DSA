package questions_2;

import java.util.Arrays;
import java.util.Stack;

public class Smaller_Elements_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,8,12,5,3,1};
        int[] smaller_Left = Smaller_Right(arr);
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(smaller_Left[i]);
        }
	}
	
	public static int [] Smaller_Left(int a[]) {
		
		Stack<Integer> s=new Stack<>();
		int [] Sarr = new int [a.length];
		
		for(int i=0; i<a.length; i++) {
			//System.out.println(a[i]);
			while(!s.isEmpty()) {
			if(s.peek()<a[i]) {
				Sarr[i]=s.peek();
				s.add(a[i]);
				break;
			}
			else 
				s.pop();
			}
			
			// if stack is empty
			if(s.isEmpty()) {
				Sarr[i]=-1;
				s.add(a[i]);
			}	
		}
		return Sarr;
	}
	
	public static int [] Smaller_Right(int a[]) {
		Stack<Integer> s=new Stack<>();
		int SR_arr[]=new int[a.length];
		for (int i=a.length-1; i>=0; i--) {
		while(!s.isEmpty()) {
			if(s.peek()<a[i]) {
				SR_arr[i]=s.peek();
				s.add(a[i]);
				break;
			}
			else
				s.pop();
		}	
		if(s.isEmpty()) {
			SR_arr[i]=-1;
			s.add(a[i]);
		}
			
		}
		
		
		return SR_arr;
	} 

}
