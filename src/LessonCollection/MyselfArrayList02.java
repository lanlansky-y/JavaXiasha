package LessonCollection;

/**
 * 手工实现ArrayList简洁版本,体会底层原理
 * 增加泛型
 */
public class MyselfArrayList02<E> {
    private Object[] elementData;
    private int size;

    private static final int DEFALT_CAPACITY = 10;

    public MyselfArrayList02(){
        elementData = new Object[DEFALT_CAPACITY];
    }

    public MyselfArrayList02(int capacity){
        elementData = new Object[capacity];
    }

    public void add(E element){
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
        MyselfArrayList02<String> my = new MyselfArrayList02<>();

        my.add("Xiaoyoung");
        my.add("lalalala");
        System.out.println(my);
    }
}
