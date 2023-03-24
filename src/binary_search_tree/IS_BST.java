package binary_search_tree;

import binary_search_tree.Tree_Creation.Node;

public class IS_BST {

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
	}
	
	static int ans=0;
	public  static void  check_IsBst( Node root) {
		if(root==null) return ;
		
		
		
	} 
	
	public  static void traversal(Node root) {
		if (root == null) return ;
		traversal(root.left);
		System.out.print(root.data+ " ");
		int cur=root.data;
		if(ans==0)
			ans=root.data;
		else
			if(cur<ans)
			     System.out.println("not a bt");
				
		traversal(root.right);
	}

}
