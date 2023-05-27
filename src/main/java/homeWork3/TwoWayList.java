package homeWork3;

/*
Необходимо реализовать метод разворота связного списка (двухсвязного или односвязного на выбор).
 */

public class TwoWayList <T> {
    Node<T> head;
    Node<T> tail;
    private int size = 0;


    public void add(T value) {
        Node<T> node = new Node<>();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
        size++;
    }


    public void revert(){
        Node<T> currentNode = head;
        while (currentNode != null){
            Node<T> next = currentNode.next;
            Node<T> previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null)
                tail = currentNode;
            if (next == null)
                head = currentNode;
            currentNode = next;
        }
    }


    public int getSize() {
        return size;
    }


}
