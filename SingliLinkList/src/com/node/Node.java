package com.node;

public class Node {
private Object data;
private Node node;

public Node(Object data, Node node) {

	this.data = data;
	this.node = node;
}
public Object getData() {
	return data;
}
public void setData(Object data) {
	this.data = data;
}
public Node getNode() {
	return node;
}
public void setNode(Node node) {
	this.node = node;
}

}
