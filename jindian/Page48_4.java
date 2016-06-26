import struct.LinkListNode;


public class Page48_4 {
	public LinkListNode partition(LinkListNode node,int x){
		LinkListNode beforeStart = null;
		LinkListNode beforeEnd = null;
		LinkListNode afterStart = null;
		LinkListNode afterEnd = null;
		while (node != null){
			LinkListNode next = node.next;
			node.next = null;
			if(node.data <x){
				if(beforeStart == null){
					beforeStart = node;
					beforeEnd = beforeStart;
				}
				else{
					beforeEnd.next = node;
					beforeEnd = node;
				}
			}
			else{
				if(afterStart == null){
					afterStart = node;
					afterEnd = afterStart;
				}
				else{
					afterEnd.next = node;
					afterEnd = node;
				}
			}
			node = next;
		}
		if(beforeStart == null){
			return afterStart;
		}
		
		beforeEnd.next = afterStart;
		return beforeStart;
	}
	
	public LinkListNode partition2(LinkListNode node,int x){
		if (node == null) return null;
		LinkListNode before = null;
		LinkListNode after = null;
		while(node != null){
			LinkListNode next = node.next;
			if(node.data<x){
				node.next = before;
				before = node;
			}
			else{
				node.next = after;
				after = node;
			}
			node = next;
		}
		if (before == null)return after;
		LinkListNode head = before;
		while(before.next != null){
			before = before.next;
		}
		before.next=after;
		return head;
	}
}
