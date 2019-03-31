public class LinkedListMain {
	private static Node head;

	public static void main(String[] args) {
		addEdges(12);
		addEdges(22);
		addEdges(2);
		addEdges(10);
		addEdges(8);
		addEdges(36);
		addEdges(3);

		printLinedList();
		System.out.print("\nAfter insertion at Beginning:-");
		insertAtBeginning(0);
		System.out.print("\nAfter insertion at Last:-");
		insertAtLast(25);
		System.out.print("\nAfter insertion at Position:-");
		insertAtPosition(3, 4);

	}

	private static void insertAtPosition(int position, int key) {
		Node temp = head;
		int counter = 1;
		while (counter < position) {
			temp = temp.next;
			counter++;
		}
		Node new_node = new Node(key);
		new_node.next = temp.next;
		temp.next = new_node;
		// Printing List
		System.out.println();
		printLinedList();
	}

	private static void insertAtLast(int key) {
		Node new_node = new Node(key);
		if (head == null) {
			head = new Node(key);
			return;
		}
		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		// Printing List
		System.out.println();
		printLinedList();
	}

	private static void insertAtBeginning(int key) {
		Node temp = new Node(key);
		temp.next = head;
		head = temp;

		// Printing List
		System.out.println();
		printLinedList();

	}

	private static void printLinedList() {
		System.out.print("The elements in Linked List are:-");
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "  ");
			temp = temp.next;

		}
	}

	private static void addEdges(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}

}
