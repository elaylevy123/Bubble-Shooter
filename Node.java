package GameEx_Final;
/**
 * This class represents a single node in a LinkedList that implements LinkedListInterface.
 * @author elay levi
 *
 */
public class Node implements NodeInterface{
	GeoShape data;
	NodeInterface next;

	public Node(GeoShape g, NodeInterface next) {
		data=g;
		this.next=next;

	}
	@Override
	public GeoShape getData() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public void setData(GeoShape g) {
		// TODO Auto-generated method stub
		this.data=g;
	}

	@Override
	public NodeInterface getNext() {
		// TODO Auto-generated method stub
		return next;
	}

	@Override
	public void setNext(NodeInterface next) {
		// TODO Auto-generated method stub
		this.next=next;
	}



}
