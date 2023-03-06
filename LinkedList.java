package GameEx_Final;

/**
 * This is a simple LinkedList class that implements LinkedListInterface.
 * Ex4: you should implement this class!
 * @author elay levi
 *
 */
public class LinkedList implements LinkedListInterface{

	Node head;
	int size;

	public LinkedList() {
		head=null;
		size=0;
	}
	@Override
	public NodeInterface getHead() {
		// TODO Auto-generated method stub
		return head;
	}
	@Override
	public void add(NodeInterface p) {
		//TODO Auto-generated method stub
			Node temp=head;
			head = new Node(p.getData(),p.getNext());
			head.next=temp;
		size++;

		Node n = new Node(p.getData(),null);
		if(head==null) {
			head=n;
		}
		else {
			Node temp1=head;
			while(temp1.getNext() != null) {
				temp1=(Node) temp1.getNext();
			}
			temp1.setNext(n);
			size++;
		}
	}
	@Override
	public void remove(NodeInterface p) {
		// TODO Auto-generated method stub
		 //Store head node
		 // Node temp =() head instanceof p;
		 //prev = null;
		Node temp = null;
		if (temp != null && temp == p.getData()) {
			head = (Node) temp.next; // Changed head
			return;
		}
		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		Node prev = null;
		while (temp != null && temp.next != p.getNext()) {
			prev = temp;
			temp = (Node) temp.next;
		}
		if (temp == null)
			return;
		prev.next = temp.next;
	}
}
