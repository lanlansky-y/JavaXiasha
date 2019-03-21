package LessonCollection.mySet;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: 测试集合
 * @author: Yang Yuzhou
 * @date: 2019/3/21
 */
public class TestSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        set1.add("a");
        set1.add("b");
        set1.add("c");
        System.out.println(set1);

        System.out.println(set1.isEmpty());;
        set1.remove("b");
        System.out.println(set1);

        Set<String> set2 = new HashSet<>();
        set2.add("d");
        set2.addAll(set1);
        System.out.println(set2);
    }
}
