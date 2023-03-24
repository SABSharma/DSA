package tree;

import java.util.LinkedList;
import java.util.Queue;

public class Creating_tree_by_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6,7,4};
		Creating_tree_by_array ob = new Creating_tree_by_array();
		Node insertLevelOrder = ob.insertLevelOrder(arr, 0);
		ob.inorder(insertLevelOrder);
		System.out.println();
		ob.levelOrder_Traversal_Queue(insertLevelOrder);

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
	
	public void inorder(Node root) {
		if(root==null) return;
		inorder(root.left);
		System.out.print(root.data+" ");
		inorder(root.right);
	}
	
	//Level Order Traversal //By using Queue
	public void levelOrder_Traversal_Queue(Node root) {
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		q.add(null);
		System.out.print(root.data);
		boolean b =false;
		while(!q.isEmpty()) {
			Node cur =q.poll();
			
			if(cur==null) {
				if(q.isEmpty())
					return;
			    q.add(null);
			    System.out.println();
			    b=true;
			    continue;
			}
			if(b)
			   System.out.print(cur.data + " ");
			if(cur.left!=null)
				q.add(cur.left);
			if(cur.right!=null)
				q.add(cur.right);
			b=false;
			
		}
		
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
