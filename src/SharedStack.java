/*
JoséMiguel Avellana
Bogdan Dragan
 */

public class SharedStack<E> implements Stack<E>{

    private final Node<E> topOfStack;          //Ultimo nodo.


    private static class Node<E>{
        private final E elem;
        private final Node<E> next;

        public Node(E e, Node<E> n) {
            elem=e;
            next=n;
        }
    }

    public SharedStack() {
        this.topOfStack=null;
    }

    public SharedStack(E elem, Node<E> node){
        this.topOfStack = new Node(elem, node);
    }

    public SharedStack(Node<E> node){
        this.topOfStack = new Node(node.elem, node.next);
    }

    @Override
    public SharedStack<E> push(E e){
        return new SharedStack<>(e, this.topOfStack);
    }

    @Override
    public SharedStack<E> pop() throws StackError {
        return new SharedStack<>(this.topOfStack.next);
    }

    @Override
    public E top() throws StackError {
        return topOfStack.elem;
    }

    @Override
    public boolean isEmpty() {
        return this.topOfStack==null;  //devuelve falo si no tiene ni elemento ni next.
    }
}
