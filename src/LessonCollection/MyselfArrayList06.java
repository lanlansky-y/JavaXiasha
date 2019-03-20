package LessonCollection;

/**
 * 增加contains(Object o),retainAll()方法(by myself)
 */
public class MyselfArrayList06<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyselfArrayList06(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyselfArrayList06(int capacity){

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
        if(index<0 || index>elementData.length-1){
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

    //contains()
    public boolean contains(E element){
        for(int i=0;i<size;i++){
            if(element.equals(elementData[i])){
                return true;
            }
        }
        return false;
    }

    //retainAll()没做好
    /*public MyselfArrayList06<E> retainAll(MyselfArrayList06<E> my){
        MyselfArrayList06<E> newMy = new MyselfArrayList06<>();
        for (int i=0;i<elementData.length;i++){
            for(int j=0;j<my.size();j++){

                if(elementData[i].equals(my.get(j))){
                    newMy.set((E)elementData[i], newMy.size());
                }
            }
        }
        return newMy;
    }*/

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for(int i=0;i<elementData.length;i++){
            sb.append(elementData[i]+",");
        }
        sb.setCharAt(sb.length()-1,']');

        return  sb.toString();
    }

    public static void main(String[] args) {
        MyselfArrayList06<String> my = new MyselfArrayList06<>(10);

        for(int i=0;i<50;i++){
            my.add("杨"+i);
        }

        System.out.println(my);

        MyselfArrayList06<String> my1 = new MyselfArrayList06<>();
        my1.add("杨10");
        my1.add("杨11");
        my1.add("杨12");
        System.out.println(my1);

//        System.out.println(my.retainAll(my1));
    }
}
