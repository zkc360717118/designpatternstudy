package iterator.v4;

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


    private class Node {
        private Object o;

        Node next;

        public Node(Object o) {
            this.o = o;
        }
    }

}
