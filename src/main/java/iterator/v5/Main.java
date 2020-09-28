package iterator.v5;

/**
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 * v4:如何对容器遍历呢？
 * v5: 实现泛型的版本
 */
public class Main {
    public static void main(String[] args) {
        Collection_<String> list = new ArrayList_<String>(); //注意这里是返回Collection_ ,可以直接用LinkList_替换
//        Collection_ list = new LinkList_(); //
        for (int i = 0; i < 15; i++) {
            list.add("S" + i);
        }

        System.out.println(list.size());

        //如何实现通用的遍历了，如果把ArrayList_ 换成LinkList_，  每次判断然后转化？ 不合适
        Iterator_<String> its = list.iterator();
        while (its.hasNext()) {
            String next = its.next();
            System.out.println(next);
        }

    }
}
