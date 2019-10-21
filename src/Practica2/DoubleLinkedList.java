package Practica2;
import java.util.*;
public class DoubleLinkedList<T> implements ListADT<T>{

	Node last;
	String descr;
	int count;
	
	public DoubleLinkedList() {
		last = new Node<T>();
	}

	@Override
	public void setDescr(String nom) {
		// TODO Auto-generated method stub
		descr = nom;
		
	}

	@Override
	public String getDescr() {
		// TODO Auto-generated method stub
		return descr;
	}

	@Override
	public T removeFirst() {
		// Hay que quitar las conexiones al primero y devolver con un nodo auxiliar, igual para removelast
		return null;
	}

	@Override
	public T removeLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T remove(T elem) {
		// Buscar el elemento T y quitarlo, se puede usar la funcion find()
		return null;
	}

	@Override
	public T first() {
		// TODO Auto-generated method stub
		return (T) last.next;
	}

	@Override
	public T last() {
		// TODO Auto-generated method stub
		return (T) last;
	}

	@Override
	public boolean contains(T elem) {
		// Se puede usar la funcion find
		return false;
	}

	@Override
	public T find(T elem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		if(last == null)
			return true;
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return count;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
