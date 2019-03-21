package LessonCollection.myIterator;

import java.util.*;

/**
 * @Description: 使用迭代器遍历list, set, map
 * @author: Yang Yuzhou
 * @date: 2019/3/21
 */
public class TestIterator {
    public static void main(String[] args) {
//        testList();
//        testSet();
        testMap();
    }

    //使用迭代器遍历list
    public static void testList() {
        List<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        for (Iterator<Integer> iterator = list.iterator(); iterator.hasNext(); ) {
            Integer i = iterator.next();
            System.out.println(i);
        }
    }

    //使用迭代器遍历set
    public static void testSet() {
        Set<String> set = new HashSet<>();
        set.add("aa");
        set.add("bb");
        set.add("cc");
        for (Iterator<String> iter = set.iterator(); iter.hasNext(); ) {
            String str = iter.next();
            System.out.println(str);
        }
    }


    public static void testMap() {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "aa");
        map.put(200, "bb");
        map.put(300, "cc");
        //使用迭代器遍历map(一)
        Set<Map.Entry<Integer, String>> ms = map.entrySet();
        for (Iterator<Map.Entry<Integer, String>> iterator = ms.iterator(); iterator.hasNext(); ) {
            Map.Entry<Integer, String> temp = iterator.next();
            System.out.println(temp.getKey() + "--" + temp.getValue());
        }

        System.out.println("=============");

        //使用迭代器遍历map(二)
        Set<Integer> keySet = map.keySet();
        for (Iterator<Integer> iter = keySet.iterator(); iter.hasNext(); ) {
            Integer key = iter.next();
            System.out.println(key + "---" + map.get(key));
        }
    }


}
