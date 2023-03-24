package ArrayDsa;

public class CountMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1= {1,2,1,5,1 ,5,6,5,5} ;
       int value= countMajority(arr1);
       System.out.println("value=:  "+value);
	}
	
	public static int countMajority( int arr []) {
		//int [] array = new int [5];
		int count=0;
		int key=0;
		System.out.println("array of 0" + arr[0]);
		for (int i=0; i<arr.length-1;i++) {
			int internalcount=0;
			for (int j=i+1; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					internalcount++;
				}
			}
			if (internalcount>count) {
				count=internalcount;
			     key=i;
			}
				
		}
		
		return arr[key];
	}

}
