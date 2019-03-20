package LessonCollection.myMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @author: Yang Yuzhou
 * @date: 2019/3/20
 */
public class TestMap {
    public static void main(String[] args) {
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1,"one");
        m1.put(2,"two");
        m1.put(3,"three");

        System.out.println(m1);
        System.out.println(m1.get(2));
        System.out.println(m1.isEmpty());
        System.out.println(m1.size());
        System.out.println(m1.containsKey(1));
        System.out.println(m1.containsValue("三"));
        m1.remove(2);

        System.out.println(m1);

        Map<Integer,String> m2 = new HashMap<>();
        m2.put(4,"四");
        m2.put(5,"五");
        System.out.println(m2);
        m1.putAll(m2);
        System.out.println(m1);
        m2.clear();
        System.out.println(m2);

    }
}
