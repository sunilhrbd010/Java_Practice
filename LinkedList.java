class Node{
	int data;
	Node next;

	public Node(int data){
		this.data= data;
		next =null;
	}
}
class LinkedList{
	Node head;

	public void printList(){
		Node node =head;

		while(node!=null){
			System.out.println(node.data);
			node =node.next;
		}
	}

	public void insertAtStart(int data){
		Node node = new Node(data);
		node.next =head;
		head =node;
	}

	public void insertInBtwn(Node prev , int data){
		Node new_node = new Node(data);
		new_node.next =prev.next;
		prev.next = new_node;
	}

	public void deleteKey(int key){
		Node temp = head , prev =null;

		if(temp.next!=null && temp.data==key){
			head=temp.next;
			return;
		}

		while(temp.next!=null && temp.data!=key){
			prev=temp;
			temp =temp.next;
		}

		prev.next =temp.next;
	}

	public void deleteAtPosition(int pos){

		int count =0;
		Node temp = head , prev =null;

		if(temp.next!=null && pos ==0){
			head = temp.next;
		}

		while(temp.next!=null && count<pos){
			prev =temp;
			temp =temp.next;
			count++;
		}

		prev.next = temp.next;
	}

	public void countList(){
		Node current = head;
		int count =0;

		while(current!=null){
			current = current.next;
			count++;
		}
		System.out.println(count);
		System.out.println();
	}
	public void search(int key){
		Node current = head;

		while(current!=null){
			if(current.data==key){
				System.out.println("true");
				return;
			}
			current =current.next;
		}
		System.out.println("false");
	}
	public static void main(String[] args) {
		LinkedList ll =new LinkedList();

		ll.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth= new Node(5);
		
		//linking
		ll.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;

		//insert in beginning
		//ll.insertAtStart(10);

		//insert at second position
		//ll.insertInBtwn(ll.head,32);

		//delete a key
		//ll.deleteKey(3);

		//ll.deleteAtPosition(2);

		//COUNT THE  NODES
		 ll.countList();

		 //Search for a key
		 ll.search(9);

		ll.printList();
	}
}