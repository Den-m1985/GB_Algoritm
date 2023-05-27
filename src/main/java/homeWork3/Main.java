package homeWork3;

public class Main {
    public static void main(String[] args) {

        TwoWayList<Integer> twoWayList = new TwoWayList<>();
        twoWayList.add(1);
        twoWayList.add(2);
        twoWayList.add(3);
        twoWayList.add(4);
        twoWayList.add(4);

        System.out.println("size: " + twoWayList.getSize());

        twoWayList.revert();

        Node<Integer> node = twoWayList.head;
        while (node != null) {
            System.out.println(node.value);
            node = node.next;
        }

    }
}
