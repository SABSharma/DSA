package binary_search_tree;



public class Tree_Creation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {30,28,40,20,10,25,5,22,27};
		//30,28,40,20,10,25,5,22,27
		Tree_Creation ob = new Tree_Creation();
		//Node root=ob.insertLevelOrder(arr, 0);
		Node root1=null;
		
		for(int i=0 ; i<arr.length; i++) {
			root1=create_bst(root1, arr[i]);
		}
		
		LNR_TRAVERSAL(root1);
		

	}
	
	public   Node insertLevelOrder(int[] arr, int i)
    {   
		
        Node root = null;
        // Base case for recursion
        if (i < arr.length) {
 
            root = new Node(arr[i]);
            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);
  
            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
	
	public static Node  create_bst(Node root , int value) {
		if(root==null) return  new Node(value);
		
		if(root.data>value)
			root.left =create_bst(root.left , value);
		else if(root.data<value)
			root.right =create_bst(root.right , value);
		
		return root;

	}
	
	//LNR Traversal
	 
	public static void LNR_TRAVERSAL(Node root) {
		if(root == null) return;
		LNR_TRAVERSAL(root.left);
		System.out.print( root.data+" ");
		LNR_TRAVERSAL(root.right);
	}
	
	
	static  class Node{
	     int data;
	     Node left;
	     Node right;
	     Node(int data){
	    	 this.data=data;
	     }
	     
		}

}
