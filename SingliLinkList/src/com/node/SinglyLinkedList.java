package com.node;

public class SinglyLinkedList {
  
	public static class Node{
		Object data;
		Node next;
		
		public Node(Object data) {
			this.data=data;	
		}	
	}
	
	public static void  display(Node a){
	Node temp=a;
	while(temp!=null) {
		System.out.print(temp.data + " ");
		temp =temp.next;
	}
	}
	public static void displayR(Node head) {
		if(head!=null) {
		System.out.print(head.data + " ");
		displayR(head.next);
		}
	}
	public static void displayReverse(Node head) {
		
		if(head==null) {
		 return ;
		}
		displayReverse(head.next);
		System.out.print(head.data + " ");
		
		
	}
	public static void main(String[] args) {
		Node head=null;
		Node a = new Node(15);
		Node b = new Node(25);
		Node c = new Node(35);
		Node d = new Node(45);
	      a.next=b;
	      b.next=c;
	      c.next=d;
	      Node temp=a;
//	      while(temp!=null) {
//	    	  System.out.print(temp.data + " ");
//	    	  temp=temp.next;
//	      }	
	      display(a);
	      System.out.println();
	      displayR(a);
	      System.out.println();
	      displayReverse(a);
	}
 
}
