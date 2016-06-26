import java.util.Hashtable;

import struct.LinkListNode;
public class Page48_1 {
	public void deleteDups(LinkListNode n){
		Hashtable table = new Hashtable();
		LinkListNode previous = null;
		while (n != null){
			if (table.containsKey(n.data)){
				previous.next = n.next;
			}
			else{
				table.put(n.data, true);
				previous = n;
			}
			n = n.next;
		}
	}
	public void deleteDups2(LinkListNode n){
		if (n == null) return ;
		
		LinkListNode current = n;
		while(current != null){
			LinkListNode runner = current;
			while(runner.next != null){
				if(runner.next.data == current.data){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			current = current.next;
		}
	}

}
