package segundaFase;

public class UnorderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements UnorderedListADT<T> {
	
	public void addToFront(T elem) {
	// a�ade un elemento al comienzo
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<T> nuevo = null;
		nuevo.data = elem;
		nuevo.next = first;
		nuevo.prev = last;
		last.next = nuevo;
		first.prev = nuevo;
		first = nuevo;
	}

	public void addToRear(T elem) {
	// a�ade un elemento al final 
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		Node<T> nuevo = null;
		nuevo.data = elem;
		nuevo.next = first;
		nuevo.prev = last;
		last.next = nuevo;
		first.prev = nuevo;
		last = nuevo;
	}
	
	public void addAfter(T elem, T target) {
	// A�ade elem detr�s de otro elemento concreto, target,  que ya se encuentra en la lista
		// �COMPLETAR OPCIONAL!
	}

}
