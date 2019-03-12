package LessonCollection;

/**
 * 手工实现ArrayList简洁版本,体会底层原理
 */
public class MyselfArrayList01 {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyselfArrayList01(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyselfArrayList01(int capacity){
        elementData = new Object[capacity];
    }

    public void add(Object obj){
        elementData[size++] = obj;
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
        MyselfArrayList01 my = new MyselfArrayList01();

        my.add("Xiaoyoung");
        my.add("lalalala");
        System.out.println(my);
    }
}
