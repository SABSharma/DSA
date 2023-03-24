package questions_2;

import java.util.Stack;

public class Greater_Element_Right_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,5,8,3};
        int[] smaller_Left = greater_Elements(arr);
        
        for(int i=0; i<arr.length; i++) {
        	System.out.println(smaller_Left[i]);
        }
	}
	
	public static int []  greater_Elements(int a[]) {
		Stack<Integer> s= new Stack<>();
		int G_arr[]=new int[a.length];
		for(int i=0; i<a.length; i++) {
		while(!s.isEmpty()) {
			if(s.peek()>a[i]) {
				G_arr[i]=s.peek();
				s.add(a[i]);
				break;
			}
			else
				s.pop();
			
		}
		if(s.isEmpty()) {
			G_arr[i]=-1;
			s.add(a[i]);
		}
		
		}
		return G_arr;
	}

}
