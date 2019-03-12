package LessonCollection;

/**
 * 增加get(),set()方法
 * 增加数组边界的检查
 */
public class MyselfArrayList04<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyselfArrayList04(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyselfArrayList04(int capacity){

        if(capacity<0){
            throw new RuntimeException("容器的容量不能为负数："+capacity);
        }else if(capacity==0){
            elementData = new Object[DEFALT_CAPACITY];
        }else {
            elementData = new Object[capacity];
        }
    }

    //get()
    public E get(int index){
        checkIndex(index);
        return (E)elementData[index];
    }

    public void set(E element,int index){
        checkIndex(index);
        elementData[index] = element;
    }

    //封装一个检查数组边界的方法
    public void checkIndex(int index){
        if(index<0 || index>size-1){
            throw new RuntimeException("索引不合法："+index);
        }
    }


    public void add(E element){

        //什么情况下需要扩容
        if(size == elementData.length){
            //怎么扩容
            Object[] newElementData = new Object[elementData.length+(elementData.length>>1)];//==>10+10/2=15
            System.arraycopy(elementData,0,newElementData,0,elementData.length);

            elementData = newElementData;
        }
        elementData[size++] = element;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<size;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');

        return  sb.toString();
    }

    public static void main(String[] args) {
        MyselfArrayList04<String> my = new MyselfArrayList04<>(10);

        for(int i=0;i<50;i++){
            my.add("杨"+i);
        }

        my.set("aaa",6);
        System.out.println(my);
        System.out.println(my.get(6));


    }
}
