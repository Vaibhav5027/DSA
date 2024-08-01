package com.node;

public class Question1 {
	
	public static class Node{
		int val;
		Node next;
		public Node(int val) {
			this.val=val;
		}
		
	}
   
	public static void deleteNode(Node node) {
		node.val=node.next.val;
		node.next=node.next.next;
		
	}
	
	public static void main(String[] array) {
		Node node1=new Node(11);
		Node node2=new Node(15);
		Node node3=new Node(49);
		Node node4=new Node(21);
		Node node5=new Node(13);
		
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		
	}
	
	//delete the node if only node is given not head and tail is given; exception for tail node;
	
	
	  
	
}
