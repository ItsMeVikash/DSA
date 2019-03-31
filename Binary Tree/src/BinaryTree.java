import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	public static void main(String[] args) {
		Node root = null;

		/*
		 * Inserting into Tree using insert(Node node,int value)
		 */

		root = insert(root, 6);
		root = insert(root, 4);
		root = insert(root, 8);
		root = insert(root, 3);
		root = insert(root, 5);
		root = insert(root, 7);
		root = insert(root, 9);

		/*
		 * Finding an Element using containsNode(Node node,int value)
		 */
		boolean isFound = containsValue(root, 5);
		System.out.println(isFound);
		isFound = containsValue(root, 50);
		System.out.println(isFound);

		/*
		 * Traversing the tree-Depth-First Search
		 */
		System.out.println("\n Depth First Search");
		System.out.println("=================================");
		System.out.print("In Order:\t");
		traverseInOrder(root);// left-Root-right
		System.out.print("\nPre Order:\t");
		traversePreOrder(root);// Root-left-right
		System.out.print("\nPost Order:\t");
		traversePostOrder(root);// left-right-Root
		System.out.println("\n=================================");
		/*
		 * Breadth-First Search-This is another common type of traversal that visits all
		 * the nodes of a level before going to the next level.
		 */
		System.out.println("\n Breadth First Search");
		System.out.println("=================================");
		BFS(root);

		/*
		 * Deleting operation using deleteElement(Node node,int value)
		 */
		root = deleteElement(root, 3);

	}

	private static void BFS(Node root) {
		if (root == null) {
			return;
		}

		Queue<Node> nodes = new LinkedList<>();
		nodes.add(root);

		while (!nodes.isEmpty()) {

			Node node = nodes.remove();

			System.out.print(" " + node.value);

			if (node.left != null) {
				nodes.add(node.left);
			}

			if (node.right != null) {
				nodes.add(node.right);
			}
		}
	}

	private static void traversePostOrder(Node node) {
		if (node != null) {
			traversePostOrder(node.left);
			traversePostOrder(node.right);
			System.out.print(" " + node.value);
		}
	}

	private static void traversePreOrder(Node node) {
		if (node != null) {
			System.out.print(" " + node.value);
			traversePreOrder(node.left);
			traversePreOrder(node.right);
		}
	}

	private static void traverseInOrder(Node node) {
		if (node != null) {
			traverseInOrder(node.left);
			System.out.print(" " + node.value);
			traverseInOrder(node.right);
		}
	}

	private static Node deleteElement(Node current, int value) {
		if (current == null) {
			return null;
		}

		if (value == current.value) {
			/*
			 * a node has no children
			 */
			if (current.left == null && current.right == null) {
				return null;
			}
			/*
			 * node has one child:
			 */
			else if (current.right == null) {
				return current.left;
			}

			else if (current.left == null) {
				return current.right;
			}
			/*
			 * node has two children. First, we need to find the node that will replace the
			 * deleted node. We’ll use the smallest node of the node to be deleted’s right
			 * sub-tree: Then, we assign the smallest value to the node to delete and after
			 * that, we’ll delete it from the right subtree:
			 */
			else {
				int smallestValue = findSmallestValue(current.right);
				current.value = smallestValue;
				current.right = deleteElement(current.right, smallestValue);
				return current;
			}

		}
		if (value < current.value) {
			current.left = deleteElement(current.left, value);
			return current;
		}
		current.right = deleteElement(current.right, value);
		return current;
	}

	private static int findSmallestValue(Node current) {
		return current.left == null ? current.value : findSmallestValue(current.left);
	}

	private static boolean containsValue(Node current, int value) {
		if (current == null) {
			return false;
		}
		if (value == current.value) {
			return true;
		}
		return value < current.value ? containsValue(current.left, value) : containsValue(current.right, value);
	}

	private static Node insert(Node current, int value) {
		if (current == null) {
			return new Node(value);
		}
		if (value < current.value) {
			current.left = insert(current.left, value);
		} else if (value > current.value) {
			current.right = insert(current.right, value);
		} else {
			// value already exists
			return current;
		}

		return current;
	}

}
