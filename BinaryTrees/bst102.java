public class bst102 {

	public class Node {
		int key;
		Node left, right;
	
		public Node(int item) {
			key = item;
			left = right = null;
		}	
	}

	Node root;

	bst102() {
		root = null;
	}

	void insert(int key) {
		root = insertRec(root, key);
	}

	Node insertRec(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if(key < root.key) {
			root.left = insertRec(root.left, key);
		}
		else if(key > root.key) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}

	void inorder() {
		inorderRec(root);
	}

	void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.key);
			inorderRec(root.right);
		}
	}

	int minValue(Node root) {
		int min = root.key;
		while(root.left != null) {
			min = root.left.key;
			root = root.left;
		}
		return min;
	}

	void deleteKey(int key) {
		root = deleteRec(root , key);
	}

	Node deleteRec(Node root, int key) {
		if(root == null) {
			return root;
		}
		if(key < root.key) {
			root.left = deleteRec(root.left, key);
		}
		else if(key > root.key) {
			root.right = deleteRec(root.right, key);
		}
		else { // if key is same as root's key, then delete this node
			// node with only one child or no child
			if(root.left == null) {
				return root.right;
			}
			else if(root.right == null) {
				return root.left;
			}
			// node with two children, then get the inorder successor (smallest
            // in the right subtree)
			root.key = minValue(root.right);
			// Deleting the inorder successor
			root.right = deleteRec(root.right, key);
		}
		return root;
	}

	public static void main(String[] args) {
		bst102 tree = new bst102();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);
		
        System.out.println("Inorder traversal of the given tree");
        tree.inorder();
 
        System.out.println("\nDelete 20");
        tree.deleteKey(20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 30");
        tree.deleteKey(30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
 
        System.out.println("\nDelete 50");
        tree.deleteKey(50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inorder();
	}
}