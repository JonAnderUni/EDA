package segundaFase;

import java.util.Iterator;

public class OrderedDoubleLinkedList<T> extends DoubleLinkedList<T> implements OrderedListADT<T> {

	public OrderedDoubleLinkedList() {
		first = null;
		last = null;
		descr = "";
		count = 0;
	}

	public void add(T elem) {
		// COMPLETAR EL CODIGO Y CALCULAR EL COSTE
		if (first == null) {
			first = new Node<T>(elem);
			last = first;
		} else {
			Node<T> nuevo = new Node<T>(elem);
			Node<T> act = first;
			if (nuevo.data.toString().compareTo(act.toString()) < 0) {
				nuevo.next = act;
				nuevo.prev = act.prev;
				act.prev.next = nuevo;
				act.prev = nuevo;
				first = nuevo;
			} else {
				act = act.next;
				while (act != first) {
					if (nuevo.data.toString().compareTo(act.toString()) < 0) {
						nuevo.next = act;
						nuevo.prev = act.prev;
						act.prev.next = nuevo;
						act.prev = nuevo;
					}
				}
			}
			if (contains(elem) == false) {
				nuevo.next = first;
				nuevo.prev = last;
				last.next = nuevo;
				first.prev = nuevo;
				last = nuevo;
			}
			last = first.prev;
		}
	}

	public void merge(DoubleLinkedList<T> zerrenda) {
		Iterator<T> it = zerrenda.iterator();
		Node<T> act = zerrenda.first;
		while (!it.hasNext()) {
			add(act.data);
			act = act.next;
		}

	}

}
