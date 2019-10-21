package Practica2;

public interface UnorderedLinkedList<T> extends ListADT<T>{

	public void addToFront(T elem);
	public void addToRear(T elem);
	public void addAfter(T elem, T target);
}
