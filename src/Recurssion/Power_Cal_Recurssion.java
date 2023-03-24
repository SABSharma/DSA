package Recurssion;

public class Power_Cal_Recurssion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       long res=calpowe(10,10);
       System.out.println("Result : " + res);
	}
	
	public static long calpowe(int a , int b) {
		 if(b==0) {
			 return 1;
		 }
		 long power=1;
		 power=calpowe(a,b-1) *a;
		
		 return power;
	}

}
