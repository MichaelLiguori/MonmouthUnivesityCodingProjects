//Sample Code to create and test a Binary Search Tree
//Adds some functionality to insert keys, traverse BST in logical order, search for keys, and compare depth of key within BST
public class BST {
	class Node{
		int key;
		Node left;
		Node right;
		
		//constructor for Node class
		Node(int k){
			left = null;
			right = null;
			key = k;
		}
		public void display() {
				System.out.println("Node with key (" + key + ") is present in BST.");
		}
	}
	
	private Node root;
	
	//constructor for BST instance
	BST(){
		root = null;
	}
	
	BST(int key){
		root = new Node(key);
	}
	
	public void insert(int key) {
		if(root == null) {
			root = new Node(key);
			return;
		}
		insert(root, key);
	}
	
	private void insert(Node node, int key) {
		if(key<node.key) {
			if (node.left==null) {
				node.left = new Node(key);
				return;
			}
			insert(node.left, key);
		}
		else if(key>node.key) {
			if(node.right == null) {
				node.right = new Node(key);
				return;
			}
			insert(node.right, key);
		}
		else {
			System.out.println("this key (" + key + ") has aleady been inserted.");
		}
	}
	
	//search a key on the tree, return node reference if found
	//otherwise, return a null
	public void displaySearch(int key) {
		Node temp = search(key);
		if (temp == null)
			System.out.println("The key (" + key + ") is not present in the BST.");
		else
			temp.display();
	}
	public Node search(int key) {
		if (root == null) 
			return null;
		else
			return search(root, key);
	}
	private Node search(Node node, int key) {
		if(key == node.key )
			return node;
		else if(key < node.key) {
			if(node.left != null)
				return search(node.left, key);
			else 
				return null;
		}
		else if (key > node.key) {
			if(node.right != null)
				return search(node.right, key);
			else
				return null;
		}
		else
			return null;
			
	}
	//Find Min
	public int findMin() {
		return findMin(root);
	}
	private int findMin(Node node) {
		if(node.left != null) 
			return findMin(node.left);
		else
			return node.key;
		
	}
	
	//Find Max
	public int findMax() {
		return findMax(root);
	}
	private int findMax(Node node) {
		if(node.right != null) {
			return findMax(node.right);
		}
		else
			return node.key;
	}
	public void display() {
		display(root);
	}
	
	//in-order traversal of BST
	private void display(Node node) {
		if(node == null)
			return;
		display(node.left);
		System.out.print(node.key + " ");
		display(node.right);
	}
	 public Node deeper(int key1, int key2){  
	 	 	Node temp1 = search(key1);
	 	 	Node temp2 = search(key2);
	 	 	if (temp1 == null && temp2 !=null) {
	 	 		System.out.println("The deeper node is node2 by default." + " Node reference: " + temp2);
	 	 		return temp2;
	 	 	}
	 	 	else if (temp2 == null && temp1 !=null) {
	 	 		System.out.println("The deeper node is node1 by default." + " Node reference: " + temp1);
	 	 		return temp1;
	 	 	}
	 	 	else if (temp1 == null && temp2 == null) {
	 	 		System.out.println("Neither node is the tree");
	 	 		return null;
	 	 	}
	 	 	else {
	 	 		return searchDepth(temp1, temp2);
	 	 	}
	 
	}  
	 public Node searchDepth(Node node1, Node node2) {
		 if (searchDepth(root, node1.key)> searchDepth(root, node2.key))
		 	return node1;
		 else if ((searchDepth(root, node1.key)< searchDepth(root, node2.key)))
			 return node2;
		 else
			 return null;
	 }
	 private int searchDepth(Node node, int key) {
			if(key == node.key )
				return 0;
			else if(key < node.key) {
				if(node.left != null)
					return searchDepth(node.left, key) +1;
				else 
					return 0;
			}
			else if (key > node.key) {
				if(node.right != null)
					return searchDepth(node.right, key) +1;
				else
					return 0;
			}
			else
				return 0;
				
		}
}
