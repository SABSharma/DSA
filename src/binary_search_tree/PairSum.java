package binary_search_tree;

import java.util.ArrayList;
import java.util.HashMap;

import binary_search_tree.Tree_Creation.Node;

public class PairSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Creation ob = new Tree_Creation();
		int arr[] = {30,28,40,20,10,25,5,22,27};
		Node root=null;
		//Node r=ob.create_bst(root, 0);
		for(int i=0 ; i<arr.length; i++) {
			root=ob.create_bst(root, arr[i]);
		}
		
		// object of paair sum
		PairSum ob1= new PairSum();
		boolean existPair = ob1.ExistPair(root, 70);
		System.out.println("dd=" +existPair);

	}
	ArrayList<Integer> al = new ArrayList<>();
	boolean b= false;
	public boolean ExistPair(Node root , int sum) {
		
		lnr(root, al, sum);
		
		
		return b;
	}
	
	public  void lnr(Node root , ArrayList<Integer> al1 , int sum) {
		if(root==null) return;
		lnr(root.left , al1 , sum);
		if( al1.contains(sum-root.data) ) {
			b=true;
		}
		lnr(root.right , al1 ,sum);
	}

}
