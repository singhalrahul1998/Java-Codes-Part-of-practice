//import java.util.*;
class LL
{
 Node head ;
  public class Node
 {
	 int data ;
	 Node next ;
	 void Node(int i)
	 {
		 data=i;
		 next = null;
	 }
 }
 void PrintList()
{
	Node n=head;
	while(n != null)
	{
		System.out.print(n.data + " ");
		n=n.next;
	}
}
}
class LinkedList
{
	public static void main(String bhwbw[])
	{
		LL obj = new LL();
		obj.head = new Node(1);
		Node N1 = new Node(2);
		Node N2 = new Node(3);
		obj.head.next = N1;
		N1.next=N2;
		obj.PrintList();
		
	}
}