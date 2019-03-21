package LessonCollection;

import java.util.*;

/**
 * @Description: 工具类Collections的使用(对List,Set,Map都有用)
 * @author: Yang Yuzhou
 * @date: 2019/3/21
 */
public class TestCollections {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(""+i);
        }
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        System.out.println(Collections.binarySearch(list,"3"));

        Set<Integer> set = new HashSet<>();
        for (int i=0;i<10;i++){
            set.add(i);
        }
        System.out.println(set);


    }
}
