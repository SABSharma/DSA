package ArrayDsa;

public class LongestSumOf_Continuous_SubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar1= {1,2,3,-2,5};
		int value= largest_Sum(ar1);
		System.out.println("LArgest value:" + value);
//		 float negativeInf = Float.NEGATIVE_INFINITY;
//	      System.out.println(negativeInf <5);

	}
	public static int largest_Sum(int arr[]) {
		float negativeInf = Float.NEGATIVE_INFINITY;
		int largestsum=(int)negativeInf;
		int currentsum=0;
		int val=0;
		int startingIndex=0;
		int endingIndex=0;
		for (int i=0; i<arr.length; i++) {
			currentsum=currentsum+arr[i];
			if (currentsum >largestsum) {
				largestsum=currentsum;
				if (startingIndex!=0) {
					endingIndex=i;
				}
				else 
				   startingIndex=i;
				
				
			}
			if (currentsum<0) {
				startingIndex=0;
				currentsum=0;
			}
		}
		System.out.println("starting index:"+startingIndex);
		System.out.println("endingIndex index:"+endingIndex);
		
		return largestsum;
	}

}
