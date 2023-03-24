package tree;

import tree.LeftView_RightView.Node;

public class Diameter_BT {
	int diameter=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6,7};
		Diameter_BT ob = new Diameter_BT();
		Node insertLevelOrder = ob.insertLevelOrder(arr, 0);
		ob.height(insertLevelOrder);
		
		System.out.println("Diameter=" + ob.diameter);

	}
	
	public   Node insertLevelOrder(int[] arr, int i)
    {   
		
        Node root = null;
        // Base case for recursion
        if (i < arr.length) {
        	// new method to add null 
//        	if(arr[i]==-1)
//    			return null;
            root = new Node(arr[i]);
            // insert left child
            root.left = insertLevelOrder(arr, 2 * i + 1);
  
            // insert right child
            root.right = insertLevelOrder(arr, 2 * i + 2);
        }
        return root;
    }
	
	int height(Node root) {
		if(root==null) return 0;
		int lh=height(root.left);
		int rh=height(root.right);
		diameter=Math.max(diameter ,1+lh+rh);
		return (Math.max(lh ,rh) +1);
		
	}
	
	class Node{
	     int data;
	     Node left;
	     Node right;
	     Node(int data){
	    	 this.data=data;
	     }
	     
		}

}
