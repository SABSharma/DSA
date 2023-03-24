package practiceQues;

import java.util.Stack;

public class Pranthesis_Check_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="{}[}[]";
		System.out.println(ispar(s1));

	}
	
	static boolean ispar(String x)
    {
       Stack<Character> s = new Stack<>();
       //check opening pair
      
       
       for(int i=0 ; i<x.length(); i++){
           if(isopening(x.charAt(i)))
                s.push(x.charAt(i));
           else {
        	   if(s.isEmpty())
        		   return false;
        	   else if(!isMatching( s.peek(), x.charAt(i) )) {
 
        		   return false;
        	   }
        		   
        	   else
        		   s.pop();
           }   
           //System.out.println(s.peek());
                           
       }             
       if (s.isEmpty())
            return true;
        else
           return false;
        
    }
    
    static boolean isopening(char c){
    	
    	return c=='{' || c=='(' || c=='[' ;
//        if(c=='{' || c=='(' || c=='[')
//            return true;
//        else 
//            return false;
    }
    static boolean isMatching(char a , char b) {
    	return (a=='{' && b=='}' ||
    			a=='[' && b==']'||
    			a=='(' && b==')');
    }

}
