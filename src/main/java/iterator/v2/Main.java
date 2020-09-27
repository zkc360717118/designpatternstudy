package iterator.v2;
/**
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 */
public class Main {
    public static void main(String[] args) {
        LinkList_ L = new LinkList_();

        for (int i = 0; i < 15; i++) {
            L.add("s"+i);
        }

        System.out.println(L.size());
    }
}

/**
        * 相比数组，这个容器不用考虑边界问题，可以动态扩展
        */
class LinkList_ {
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
