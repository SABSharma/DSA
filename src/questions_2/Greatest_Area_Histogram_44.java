package questions_2;

import java.util.Stack;

public class Greatest_Area_Histogram_44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,3};
		int[] smaller_Left = smaller_left(arr);

		for(int i=0; i<arr.length; i++) {
			System.out.println(smaller_Left[i]);
		}
	}

	public static int [] smaller_left(int [] a) {
		Stack<Integer> s= new Stack<>();
		int Sleft[] = new int[a.length];
		for(int i=0; i<a.length; i++) {
			
			while(!s.isEmpty() && s.peek()>=a[i]) {
				s.pop();
			}
			if(s.isEmpty())
				Sleft[i]=-1;
			else 
				Sleft[i]=a[i];
			
			s.push(a[i]);


		}
		return Sleft;

	}
	
}
