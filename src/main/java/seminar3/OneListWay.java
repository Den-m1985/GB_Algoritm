package seminar3;

public class OneListWay<E> {
    private Node<E> head;


    public void add(E value) {
        Node<E> node = new Node<>();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }


    public void add(int index, E value) {
        if (index >= size() || index < 0) throw new ArrayIndexOutOfBoundsException();
        if (index != 0) {
            Node<E> currentNode = head;
            while (index > 0) {
                index--;
                currentNode = currentNode.next;
            }
            Node<E> node = new Node<>();
            node.value = value;
            Node<E> temp = currentNode.next;
            currentNode.next = node;
        }else add(value);
    }

    public void addLast(E value){
        add(size()-1, value);
    }

    public int size() {
        int result = 0;
        Node<E> currentNode = head;
        while (currentNode != null) {
            result++;
            currentNode = currentNode.next;
        }
        return result;
    }

    public E get(int index) {
        int count = 0;
        Node<E> currentNode = head;
        while (count < index) {
            count++;
            if (currentNode.next == null) throw new ArrayIndexOutOfBoundsException();
            currentNode = currentNode.next;
        }
        return currentNode.value;
    }


    public boolean contains(E value) {
        Node<E> currentNode = head;
        while (currentNode != null) {
            if (currentNode.value == value)
                return true;
            currentNode = currentNode.next;
        }
        return false;
    }

    public int indexOf(E value) {
        Node<E> currentNode = head;
        int count = 0;
        while (currentNode != null) {
            if (currentNode.value == value)
                return count;
            currentNode = currentNode.next;
            count++;
        }
        return -1;
    }

}
