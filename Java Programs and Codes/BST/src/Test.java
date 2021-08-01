
public class Test {

	public static void main(String[] args) {
		BST bst = new BST();
		bst.insert(12);
		bst.insert(5);
		bst.insert(20);
		bst.insert(8);
		bst.insert(3);
		bst.insert(28);
		bst.insert(22);
		bst.insert(30);
		bst.insert(7);
		bst.insert(10);
		bst.insert(25);
		
		bst.display();
		System.out.println();
		System.out.println();
		
		bst.deeper(12, 20).display();
		System.out.println();
		
		bst.deeper(0, 5).display();//This should be rewritten in recursive function to display without need of invoking display
		System.out.println();
		
		bst.deeper(0, 0).display(); //This will throw null pointer exception
		System.out.println();
		
		System.out.print(bst.deeper(12, 10));


	}

}
