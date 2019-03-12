package LessonCollection;

/**
 * 增加数组的扩容
 */
public class MyselfArrayList03<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyselfArrayList03(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyselfArrayList03(int capacity){
        elementData = new Object[capacity];
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
        MyselfArrayList03<String> my = new MyselfArrayList03<>();

        for(int i=0;i<100;i++){
            my.add("杨"+i);
        }
        System.out.println(my);
    }
}
