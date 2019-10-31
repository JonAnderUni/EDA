package segundaFase;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<T> implements ListADT<T> {

	// Atributos
	protected Node<T> first; // apuntador al primero
	protected Node<T> last; // apuntador al ultimo
	protected String descr; // descripci�n
	protected int count;

	// Constructor
	public DoubleLinkedList() {
		first = null;
		last = null;
		descr = "";
		count = 0;
	}

	public void setDescr(String nom) {
		descr = nom;
	}

	public String getDescr() {
		return descr;
	}

	public T removeFirst() {
		// Elimina el primer elemento de la lista
		// Precondici�n: la lista tiene al menos un elemento
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<T> act = first;
		act.next.prev = act.prev;
		act.prev.next = act.next;
		first = act.next;

		return (T) act;
	}

	public T removeLast() {
		// Elimina el �ltimo elemento de la lista
		// Precondici�n: la lista tiene al menos un elemento
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<T> act = last;
		act.next.prev = act.prev;
		act.prev.next = act.next;
		last = act.prev;
		return (T) act;
	}

	public T remove(T elem) {
		// Elimina un elemento concreto de la lista
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Boolean found = false;
		Node<T> act = first;
		while (found == false) {
			if(act.data.equals(elem))  {
				found =true;
			}else {
				act = act.next;
			}
		}
		act.next.prev = act.prev;
		act.prev.next = act.next;
		last = act.prev;
		return (T) act;
	}

	public T first() {
		// Da acceso al primer elemento de la lista
		if (isEmpty())
			return null;
		else
			return first.data;
	}

	public T last() {
		// Da acceso al �ltimo elemento de la lista
		if (isEmpty())
			return null;
		else
			return first.prev.data;
	}

	public boolean contains(T elem) {
		// Determina si la lista contiene un elemento concreto
		if (isEmpty())
			return false;
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		return false;//Puesto para que no salte error
	}

	public T find(T elem) {
		// Determina si la lista contiene un elemento concreto, y develve su referencia,
		// null en caso de que no est�
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Boolean found = false;
		Node<T> act = first;
		int temp;
		temp = 0;
		while (found == false && temp <= count) {
			if(act.data.equals(elem))  {
				found =true;
			}else {
				act = act.next;
			}
		}
		if(found) {
			return (T) act;
		}
		return null;//Puesto para que no salte error
	}

	public boolean isEmpty()
	// Determina si la lista est� vac�a
	{
		return first == null;
	};

	public int size()
	// Determina el n�mero de elementos de la lista
	{
		return count;
	};

	/** Return an iterator to the stack that iterates through the items . */
	public Iterator<T> iterator() {
		return new ListIterator();
	}

	// an iterator, doesn't implement remove() since it's optional
	private class  ListIterator implements Iterator<T> {
		Node<T> act;
		@Override
		public boolean hasNext() {
			
			return act != null;
		}

		@Override
		public T next() {
			T data = act.data;
			act=act.next;
			return data;
		}

		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		public ListIterator() {
			act = first;
		}
	} // private class

	public void visualizarNodos() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		String result = new  String(); 
		Iterator<T> it = iterator();
		while (it.hasNext()) {
			T elem = it.next();
			result = result + "[" + elem.toString() + "] \n";
		}
		return "SimpleLinkedList " + result + "]";
	}

}
