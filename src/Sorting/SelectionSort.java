package Sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a1= {5,6,7,2,1,3};
		int [] returnarr = sort( a1 ); 
		
		for(int i=0; i<returnarr.length; i++) {
			System.out.println(returnarr[i]);
		}

	}
	
	public static int [] sort( int a[]) {
		
		int [] arr = a;
		for (int i=0; i<a.length; i++) {
			int min=arr[i];
			int minindex=i;
			int temp=arr[i];
			for(int j=i+1; j<a.length; j++) {
			if(a[j]< min) {
				min=arr[j];
				minindex=j;
				
			}
			
			
			}
			arr[i]=min;
			arr[minindex]=temp;
		}
		return arr ;
		
	}

}
