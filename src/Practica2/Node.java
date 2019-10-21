package Practica2;

public class Node<T> {
	private T data;
	Node next;
	Node prev;
	public Node(T data) {
		this.data = data;
		prev = new Node<T>();
		next = new Node<T>();
	}
	public Node() {
		data = null;
		prev = new Node<T>();
		next = new Node<T>();
	}
}
