package iterator.v4;

/**
 * v1:构建一个容器，可以添加对象
 * v2:用链表来实现一个容器
 * v3:添加容器的共同接口，实现容器的替换
 * v4:如何对容器遍历呢？
 */
public class Main {
    public static void main(String[] args) {
        Collection_ list = new ArrayList_(); //注意这里是返回Collection_ ,可以直接用LinkList_替换
        for (int i = 0; i < 15; i++) {
            list.add("S" + i);
        }

        System.out.println(list.size());

        //如何实现通用的遍历了，如果把ArrayList_ 换成LinkList_，  每次判断然后转化？ 不合适
        ArrayList_ al = (ArrayList_) list;
        for (int i = 0; i < al.size(); i++) {
//            System.out.println(al);

        }
    }
}
