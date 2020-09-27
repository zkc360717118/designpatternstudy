package iterator.v5;

/**
 * 相比数组，这个容器不用考虑边界问题，可以动态扩展
 */
class ArrayList_ implements Collection_ {
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


    @Override
    public Iterator_ iterator() {
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements Iterator_ {
        private int currentIndex = 0;
        @Override
        public boolean hasNext() {
            if (currentIndex >= index) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {
            Object o = objects[currentIndex];
            currentIndex ++;
            return o;
        }
    }

}
