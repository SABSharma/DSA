package binary_search_tree;

import binary_search_tree.Tree_Creation.Node;

public class Floor_Ceil_value {

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
		int floor = Floor(root, 6);
		System.out.println("floor="+floor);
		Node search = search(root, 20);
		System.out.println("search" +search.data);
		System.out.println();
		int ceil = Ceil(root, 6);
		System.out.println("Ceil="+ceil);

	}
	
	 static int ans=0;
	public static  int Floor(Node root ,int key) {
		int data= Integer.MAX_VALUE;
		while(root!=null) {
			if(root.data==key) {
				data=key;
			}
			if(root.data<key) {
				data=root.data;
				root=root.right;
			}
			else
				root=root.left;
				
		}
		return data;
		
		
		
	}
	
	public static int  Ceil( Node root , int key) {
		int ans=Integer.MIN_VALUE;
		while(root!=null) {
			if(root.data==key)
				ans=root.data;
			if(root.data<key) {
				root=root.right;
			}
			else {
				ans=root.data;
				root=root.left;
			}
		}
		return ans;
	}
	
	public static  Node search(Node root, int key)
	{
	    // Base Cases: root is null or key is present at root
	    if (root==null || root.data==key)
	        return root;
	 
	    // Key is greater than root's key
	    if (root.data < key)
	       return search(root.right, key);
	 
	    // Key is smaller than root's key
	    return search(root.left, key);
	}
	
	

}
