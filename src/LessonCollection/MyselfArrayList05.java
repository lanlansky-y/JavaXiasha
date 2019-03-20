package LessonCollection;

/**
 * 增加Remove(int index),Remove(Object o),size(),isEmpty()方法
 */
public class MyselfArrayList05<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyselfArrayList05(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyselfArrayList05(int capacity){

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

    //Remove(int index)
    public void remove(int index){
        checkIndex(index);
        int numMove = elementData.length-1-index;
        if(numMove!=0){
            //使用System.arraycopy()方法移除元素
            System.arraycopy(elementData,index+1,elementData,index,numMove);
        }
        elementData[--size] = null;
//        size--;
    }

    //Remove(E element)
    public void remove(E element){
        //使用equals()方法比较
        for(int i=0;i<size;i++){
            if(element.equals(elementData[i])){
                remove(i);
            }
        }
    }

    //size()
    public int size(){
        return size;
    }

    //isEmpty()
    public boolean isEmpty(){
        return size==0?true:false;
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
        MyselfArrayList05<String> my = new MyselfArrayList05<>(10);

        for(int i=0;i<50;i++){
            my.add("杨"+i);
        }

        System.out.println(my);
        my.remove(3);
        System.out.println(my);
        my.remove("杨5");
        System.out.println(my);
        System.out.println(my.size);
        System.out.println(my.isEmpty());
    }
}
