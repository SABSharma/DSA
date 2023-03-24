package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import tree.Creating_tree_by_array.Node;

public class LeftView_RightView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Node> al = new ArrayList<>();
		ArrayList<Node> listright = new ArrayList<>();
		int level=0;
		
		int arr[] = {1,2,3,4,5,6,7};
		LeftView_RightView ob =new LeftView_RightView();
		Node insertLevelOrder = ob.insertLevelOrder(arr, 0);
        ob.levelOrder_Traversal_Queue(insertLevelOrder);
        ob.leftView(insertLevelOrder, al, level);
        System.out.println("left View:");
        for(Node cur: al) {
        	System.out.print(cur.data+"");	
        }
        ob.rightView(insertLevelOrder, listright, 0);
        System.out.println();
        System.out.println("Right View View:");
        for(Node cur1: listright) {
        	System.out.print(cur1.data+"");	
        }
        
        
         
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
	
	public void levelOrder_Traversal_Queue(Node root) {
		Queue<Node> q= new LinkedList<>();
		q.add(root);
		q.add(null);
		//System.out.print(root.data);
		//boolean b =false;
		while(!q.isEmpty()) {
			Node cur =q.poll();
			
			if(cur==null) {
				if(q.isEmpty())
					return;
			    q.add(null);
			    System.out.println();
			  
			    continue;
			}
			
			System.out.print(cur.data + " ");
			if(cur.left!=null)
				q.add(cur.left);
			if(cur.right!=null)
				q.add(cur.right);
			
			
		}
		
	}
	
	public void leftView(Node root,ArrayList<Node> al , int level) {
		     if (root==null) return;
//	         if(al.get(level)==null)
//	        	 al.add(root);
	         if(al.size()<=level) { al.add(level,root);}
	         //   else{ al.set(level,root); }
	         leftView(root.left, al, level+1);
	         leftView(root.right, al, level+1);
	         
	}
	
	//Right View 
	 //there is only one change for right view
	public void rightView(Node root,ArrayList<Node> listright , int level) {
	     if (root==null) return;

        if(listright.size()<=level) { listright.add(level,root);}
        //else{ listright.set(level,root); }
        leftView(root.left, listright, level+1);
        leftView(root.right, listright, level+1);
        
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
