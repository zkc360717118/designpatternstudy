package iterator.v5;

/**
        * 相比数组，这个容器不用考虑边界问题，可以动态扩展
        */
class LinkList_ implements Collection_ {
    Node head = null;
    Node tail = null;

    //目前容器中有多少个元素
    private int size=0;

    public void add(Object o) {
        Node node = new Node(o);
        node.next = null;

        if (head == null) {
            head = node;
            tail = node;
        }

        tail.next = node; //把旧的tail 的指针指向新的节点
        tail = node;// 更新最新的tail

        size ++;

    }

    public int size() {
        return size;
    }

    @Override
    public Iterator_ iterator() {
        return new LinkListIterator();

    }

    private class LinkListIterator implements Iterator_{
        private Node currentNode;

        @Override
        public boolean hasNext() {
            //第一次
            if (currentNode == null && head != null ) {
                return true;
            }

            //第二次以上
            if (currentNode.next != null) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (currentNode == null) {
                currentNode = head;
                return currentNode;
            }

            currentNode = currentNode.next;
            return currentNode;
        }
    }

    private class Node {
        private Object o;

        Node next;

        public Node(Object o) {
            this.o = o;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "o=" + o +
                    ", next=" + next +
                    '}';
        }
    }

}
