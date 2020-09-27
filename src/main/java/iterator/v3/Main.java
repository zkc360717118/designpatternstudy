package iterator.v3;

/**
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 */
public class Main {
    public static void main(String[] args) {
        Collection_ list = new ArrayList_(); //注意这里是返回Collection_ ,可以直接用LinkList_替换
        for (int i = 0; i < 15; i++) {
            list.add("S" + i);
        }

        System.out.println(list.size());
    }
}
