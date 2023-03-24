package practiceQues;

import java.util.ArrayList;
import java.util.Stack;

public class leftViewBT {
	ArrayList <Integer> al = new ArrayList<>();
    Stack<Integer> s = new Stack<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leftViewBT ob = new leftViewBT();
		ob.leftView(4);
	}
	
	
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(int root)
    {
      // Your code here
      //Tree ob = new Tree();
    	leftViewBT ob1 = new leftViewBT();
       ob1.inorder(root);
       
       
      //System.out.println(s.pop());
      while(!s.isEmpty()){
          al.add(s.pop());
      }
      return al;
    }
    void inorder(int root ){
        //if(root==null) return;
        //inorder(root.left);
        s.push(root);
        s.push(5);
        s.push(6);
       // System.out.print(root.data +" ");
        //inorder(root.right);
        System.out.println(s.size());
    }

}
