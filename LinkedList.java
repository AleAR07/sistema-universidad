import java.util.Iterator;

public class LinkedList<E> implements Lista<E> {

    private class Node<E> {
        private Node<E> next = null;
        private E info = null;

        public Node(Node<E> next, E info) {
            this.next = next;
            this.info = info;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public E getInfo() {
            return info;
        }

        public void setInfo(E info) {
            this.info = info;
        }

    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int tamanio = 0;

    // ==== METODOS DE AGREGAR ====

    @Override
    public void agregarInicio(E e) {
        // Nodo "auxiliar" que guardara la info y despues sera posicionado.
        Node<E> aux = new Node<>(null, e);

        if (esVacia()) {
            head = aux;
            tail = aux;
        } else {
            aux.setNext(head);
            head = aux;
        }
        // Dado cualquier caso al agregar, se aumentara el tamanio
        tamanio++;
    }

    @Override
    public void agregarFinal(E e) {
        Node<E> aux = new Node<>(null, e);
        if (esVacia()) {
            head = aux;
            tail = aux;
        } else {
            tail.setNext(aux);
            tail = aux;
        }
        tamanio++;

    }

    @Override
    public void agregarElemento(E e) {
        // Hace lo mismo que en agregar final
        agregarFinal(e);
    }

    @Override
    public void agregarPosicion(E e, int posicion) {
        if (posicion >= 0 && posicion <= tamanio) {
            if (posicion == 0) {
                agregarInicio(e);
            } else if (posicion == tamanio) {
                agregarFinal(e);
            } else {
                Node<E> aux = new Node<>(null, e);
                Node<E> iterador = head;

                for (int i = 0; i < (posicion - 1); i++) {
                    iterador = (iterador.getNext());
                }
                aux.setNext(iterador.getNext());
                iterador.setNext(aux);
                tamanio++;
            }

        } else {
            throw new IndexOutOfBoundsException("Posicion invalida: " + posicion);
        }
    }

    // ==== METODOS DE ELIMINAR ====
    @Override
    public E eliminarElemento() {
        if (esVacia()) {
            System.out.println("La lista ya esta vacia.");
            return null;
        }
        return eliminarElementoFinal();
    }

    @Override
    public E eliminarElementoInicio() {
        if (esVacia()) {
            return null;
        }
        E eliminado = head.getInfo();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }
        tamanio--;
        return eliminado;

    }

    @Override
    public E eliminarElementoFinal() {
        if (esVacia()) {
            return null;
        }
        E eliminado = tail.getInfo();
        if (head == tail) {
            head = null;
            tail = null;
        } else {
            Node<E> iterator = head;
            while (iterator.getNext() != tail) {
                iterator = iterator.getNext();
            }
            iterator.setNext(null);
            tail = iterator;
        }
        tamanio--;
        return eliminado;
    }

    @Override
    public E eliminarElementoPosicion(int posicion) {
        if (posicion >= 0 && posicion < tamanio) {
            if (posicion == 0) {
                return eliminarElementoInicio();
            } else if (posicion == tamanio - 1) {
                return eliminarElementoFinal();
            } else {
                Node<E> iterador = head;
                for (int i = 0; i < (posicion - 1); i++) {
                    iterador = iterador.getNext();
                }
                Node<E> nodoEliminar = iterador.getNext();
                E eliminado = nodoEliminar.getInfo();
                iterador.setNext(nodoEliminar.getNext());
                tamanio--;
                return eliminado;
            }
        } else {
            throw new IndexOutOfBoundsException("Posicion invalida: " + posicion);
        }
    }

    // UTILIDADES
    @Override
    public boolean esVacia() {
        return tamanio == 0;
    }

    @Override
    public int numElementos() {
        return tamanio;
    }

    @Override
    public void limpiarLista() {
        head = null;
        tail = null;
        tamanio = 0;
    }

    @Override
    public E consultar(int posicion) {
        if (posicion >= 0 && posicion < tamanio) {
            Node<E> iterador = head;
            for (int i = 0; i < posicion; i++) {
                iterador = iterador.getNext();
            }
            return iterador.getInfo();
        } else {
            throw new IndexOutOfBoundsException("Posicion invalida: " + posicion);
        }
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {

            Node<E> nodo = head;

            public boolean hasNext() {
                return nodo != null;
            }

            public E next() {
                E tmp = nodo.getInfo();
                nodo = nodo.getNext();
                return tmp;
            }

        };
    }

}
