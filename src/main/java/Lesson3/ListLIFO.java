package Lesson3;
/*
односвязный список
 */

public class ListLIFO {
    List.Node head;


    public void push(int value) {
        List.Node node = new List.Node();
        node.value = value;
        node.next = head;
        head = node;
    }

    public Integer pop() {
        Integer result = null;
        if (head != null) {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    public void revert() {
        if (head != null && head.next != null) {
            List.Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(List.Node currentNode, List.Node previousNode) {
        if (currentNode.next == null)
            head = currentNode;
        else revert(currentNode.next, currentNode);
        currentNode.next = previousNode;
    }
}
