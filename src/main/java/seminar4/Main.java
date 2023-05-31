package seminar4;

public class Main {

//    public V remove(K key) {
//        Integer index = key.hashCode() % 16;
//        Node<K, V> currentNode = nodes[index];
//        if (currentNode != null) {
//            while (currentNode.nextnode != null) {
//                if (currentNode.nextnode.key == key) {
//                    V result = currentNode.nextnode.value;
//                    currentNode.nextnode = currentNode.nextnode.nextnode;
//                    return result;
//                }
//                currentNode = currentNode.nextnode;
//            }
//        }
//        return null;
//    }
//
//
//    public V remove(K key) {
//        int index = getIndex(key);
//        Node<K, V> currentNode = nodes[index];
//        Node<K, V> prevNode = null;
//        while (currentNode != null) {
//            if (currentNode.key == key) {
//                if (prevNode == null) {
//                    nodes[index] = currentNode.nextNode;
//                } else {
//                    prevNode.nextNode = currentNode.nextNode;
//                }
//                return currentNode.value;
//            }
//            prevNode = currentNode;
//            currentNode = currentNode.nextNode;
//        }
//        return null;
//    }
//
//
//    public V get(K key) {
//        int index = getIndex(key);
//        Node<K, V> currentNode = nodes[index];
//        while (currentNode != null) {
//            if (currentNode.key == key) {
//                return currentNode.value;
//            }
//            currentNode = currentNode.nextNode;
//        }
//        return null;
//    }
//
//
//
//    public class Mapa <K, V> {
//        Node<K, V>[] nodes = new Node[6];
//        int size = 16;
//
//        public V put(K key, V value) {
//            Node<K, V> newNode = new Node<>(key, value);
//            int index = getIndex(key);
//            Node<K, V> currentNode = nodes[index];
//            while (currentNode != null) {
//                if (currentNode.key == key) {
//                    V tmp = currentNode.value;
//                    currentNode.value = value;
//                    return tmp;
//                }
//                currentNode = currentNode.nextNode;
//            }
//            newNode.nextNode = nodes[index];
//            nodes[index] = newNode;
//            return null;
//        }
//
//        private int getIndex(K key) {
//            return Math.abs(key.hashCode()) % size;
//        }
//
//    }
//
//
//    public void put(K key, V value) {
//        if (nodes == null) {
//            nodes = new Node[16];
//        }
//
//        int index = Math.abs(key.hashCode() % 16);
//
//        if (nodes[index] == null) {
//            nodes[index] = new Node<>();
//            nodes[index].key = key;
//            nodes[index].value = value;
//        } else {
//            Node<K, V> current = nodes[index];
//
//            while (current != null) {
//                if (current.key.equals(key)) {
//                    current.value = value;
//                    return;
//                }
//
//                if (current.next == null) {
//                    current.next = new Node<>();
//                    current.next.key = key;
//                    current.next.value = value;
//                    return;
//                }
//
//                current = current.next;
//            }
//        }
//    }
//
//
//    public class HashMap<K, V> {
//
//        private Node<K, V>[] nodes;
//        private int capacity;
//
//        public HashMap(int capacity) {
//            this.capacity = capacity;
//            this.nodes = new Node[capacity];
//        }
//
//        public void put(K key, V value) {
//            int index = getIndex(key);
//            if (nodes[index] == null) {
//                nodes[index] = new Node<>(key, value);
//            } else {
//                Node<K, V> current = nodes[index];
//                while (current != null && !current.getKey().equals(key)) {
//                    current = current.getNext();
//                }
//                if (current != null) {
//                    current.setValue(value);
//                } else {
//                    current = new Node<>(key, value);
//                    current.setNext(nodes[index]);
//                    nodes[index] = current;
//                }
//            }
//        }
//
//        public V get(K key) {
//            int index = getIndex(key);
//            Node<K, V> current = nodes[index];
//            while (current != null && !current.getKey().equals(key)) {
//                current = current.getNext();
//            }
//            return current != null ? current.getValue() : null;
//        }
//
//        private int getIndex(K key) {
//            return Math.abs(key.hashCode()) % capacity;
//        }
//
//    }
}
