import struct.LinkListNode;


public class Page48_3 {
	public boolean deleteNode(LinkListNode n){
		if (n == null||n.next ==null){
			return false;
		}
		LinkListNode next = n.next;
		n.data=next.data;
		n.next=next.next;
		return true;
	}
}
