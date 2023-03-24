package binary_search_tree;

import binary_search_tree.Tree_Creation.Node;

public class Delete_Node {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tree_Creation ob = new Tree_Creation();
		int arr[] = {30,28,40,20,10,25,5,22,27};
		Node root=null;
		//Node r=ob.create_bst(root, 0);
		for(int i=0 ; i<arr.length; i++) {
			root=ob.create_bst(root, arr[i]);
		}
		
		ob.LNR_TRAVERSAL(root);
		
		Node Droot=Delete_Node(root, 20);
		System.out.println("");
		ob.LNR_TRAVERSAL(Droot);
		
		

	}
	
	public static Node Delete_Node(Node root , int key) {
		
		if(root==null) return null;
		
		if(root.data>key)
			root.left=Delete_Node(root.left, key);
		else if(root.data<key)
			root.right=Delete_Node(root.right, key);
		else {
			if(root.left==null)
				return root.right;
			else if(root.right==null)
				return root.left;
		    
		    root.data=minValue(root.right);
		    root.right=Delete_Node(root.right, root.data);
		}
				
		
		return root;
		
	}
	
	static int minValue(Node root) {
		
		int min=root.data;
		while(root.left!=null) {
			min=root.left.data;
			root=root.left;
		}
		return min;
		
		
	}
	

}
