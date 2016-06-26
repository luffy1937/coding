import struct.LinkListNode;
public class Page48_2 {
	public int nthToLast(LinkListNode head, int k){
		if(head == null){
			return 0;
		}
		int i =nthToLast(head.next,k) + 1;
		if(i == k){
			System.out.println(head.data);
		}
		return i;
	}
	public class IntWrapper{
		public int value = 0;
	}
	LinkListNode nthToLastR(LinkListNode head,int k ,IntWrapper i){
		if(head == null) return null;
		LinkListNode node = nthToLastR(head.next,k,i);
		i.value = i.value + 1;
		if(i.value == k){
			return head;
		}
		return node;
	}
	LinkListNode nthToLast2(LinkListNode head ,int k){
		if (k <= 0) return null;
		LinkListNode fast =head;
		LinkListNode slow = head;
		for (int i =0;i<k-1;i++){
			if(fast != null){
				fast = fast.next;
			}
			else{
				return null;
			}
		}
		while(fast.next != null){
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
}
