package iterator.v1;
/**
 * 构建一个容器，可以添加对象
 */

public class Main {
    public static void main(String[] args) {
        ArrayList_ arrayList_ = new ArrayList_();
        for (int i = 0; i < 15; i++) {
            arrayList_.add("s"+i);

        }
        System.out.println(arrayList_.size());

    }
}

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_ {
    Object[] objects = new Object[10];
    private int index = 0; // objects中下一个空的位置在哪儿，或者说目前容器中有几个元素

    public void add (Object o) {
        //如果数据容量超了
        if (index == objects.length) {
            Object[] newObj = new Object[this.objects.length * 2];
            System.arraycopy(objects,0,newObj,0,objects.length);
            objects = newObj;
        }

       objects[index] = o;
       index++;
    }

    public int size() {
        return index;
    }


}
