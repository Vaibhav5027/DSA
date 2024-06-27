package com.node;

public class Implementation {
	public static class Node {
		Object data;
		Node next;

		public Node(Object data) {
			this.data = data;
		}
	}

	public static class LinekedList {
		Node head = null;
		Node tail = null;

		void insertAtEnd(int data) {
			Node node = new Node(data);
			// If LL is already Not available
			if (head == null) {
				head = node;
				tail = node;
			}
			//If LL is already available
			else {
				tail.next = node;
				tail = node;
			}
		}
		
		void display() {
			Node temp=head;
			while(temp!=null) {
				System.out.print(temp.data + " ");
				temp=temp.next;
			}
		}
		
		int size() {
			Node temp=head;
			int count=0;
			while(temp!=null) {
				count++;
				temp=temp.next;
			}
			return count;
		}
		
		void insertAtBeggining(Object data){
			Node newNode=new Node(data);
			if(head==null) {
				head=newNode;
				tail=newNode;
			}
			else {
//				Node temp=head;
//				head=newNode;
//				newNode.next=temp;
				newNode.next=head;
				head=newNode;
				
			}
		}
		
		void insertAtGivenPos(int pos,Object data){
			Node newNode=new Node(data);
			Node temp=head;
			if(pos==0) {
				insertAtBeggining(data);
				return;
			}
			else if(pos==size()) {
				insertAtEnd(pos);
			}
			else if(pos<=0 || pos>size()) {
				System.out.println("Invalid Index");
				return;
			}
			for(int i=0;i<pos-1;i++) {
				temp=temp.next;
			}
			newNode.next=temp.next;
			temp.next=newNode;
		}
		int getElementAt(int idx){
			Node temp=head;
			for(int i=0;i<idx;i++) {
				temp=temp.next;
			}
			return (int) temp.data;
		}
		void deleteAt(int pos) {
			Node temp=head;
			for(int i=0;i<pos-1;i++) {
				temp=temp.next;
			}
			temp.next=temp.next.next;
			
		}
	}
  
	public static void main(String[] args) {
		LinekedList ll=new LinekedList();
		ll.insertAtEnd(4);
		ll.insertAtEnd(6);
		ll.insertAtEnd(7);
		ll.insertAtEnd(9);
		ll.insertAtEnd(11);
		ll.insertAtBeggining(100);
		ll.insertAtGivenPos(2, 55);
		ll.insertAtGivenPos(2, 65);
		ll.display();
		System.out.println();
		ll.deleteAt(3);
		ll.display();
		System.out.println(ll.getElementAt(3));
		System.out.println("Size: "+ll.size());
	}
}
