package io.satya;

public class CheckLoopINLinkedListSlowAndFastPointer {

	static Node head;

	public static void main(String[] args) {

		CheckLoopINLinkedListSlowAndFastPointer list2 = new CheckLoopINLinkedListSlowAndFastPointer();
		list2.push(20);
		list2.push(30);
		list2.push(40);

		list2.head.next.next.next = list2.head;
		if(list2.loopDetect(head)){
			System.out.println("Loop Found");
		}else
			System.out.println("Loop Not found");

	}

	static class Node {

		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	static void push(int data) {

		Node node = new Node(data);
		node.next = head;
		head = node;
	}

	static boolean loopDetect(Node node){
		
		Node slowPtr = node,fastPtr = node;
		
		while(slowPtr != null && fastPtr !=  null && fastPtr.next !=null ){
			
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if(slowPtr==fastPtr){
				return true;
			}
			
			
		}
		
	return false;
		
	}

}
