package LessonCollection.mySet;

import java.util.HashMap;

/**
 * @Description: 自定义一个简易集合
 * @author: Yang Yuzhou
 * @date: 2019/3/21
 */
public class Set00 {
    HashMap map;
    private static final Object PRESENT = new Object();

    public Set00() {
        map = new HashMap();
    }

    public void add(Object o){
        map.put(o,PRESENT);

    }
    public int size(){
        return map.size();
    }
    public Object remove(Object o){
        for (Object key:map.keySet()){
            if(key.equals(o)){
                map.remove(key);
                return key;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Object key:map.keySet()) {
            sb.append(key+",");
        }
        sb.setCharAt(sb.length()-1,']');
        return sb.toString();
    }

    public static void main(String[] args) {
        Set00 set = new Set00();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.remove("a"));
        System.out.println(set);
    }
}
