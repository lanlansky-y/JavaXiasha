package LessonCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TestCollection {
    public static void main(String[] args) {
        test03();
    }
    /**
     * 测试Collection接口中的方法
     */
    public static void test01(){
        Collection<String> c = new ArrayList<>();
        System.out.println(c.size());
        System.out.println(c.isEmpty());

        c.add("小杨");
        System.out.println(c);
        ((ArrayList<String>) c).add(0,"小样");
        System.out.println(c);
        System.out.println(c.size());

        System.out.println(c.contains("小样"));
        System.out.println(c.contains("小鱼"));

        c.remove("小样");
        System.out.println(c);
        System.out.println(c.size());

        c.clear();
        System.out.println(c);
        System.out.println(c.size());
    }

    /**
     * 容器与容器之间的操作
     */
    public static void test02(){
        Collection<String> list = new ArrayList<>();
        list.add("迪迦");
        list.add("雷欧");
        list.add("泰罗");

        Collection<String> list1 = new ArrayList<>();
        list1.add("咸蛋");
        list1.add("超人");
        list1.add("迪迦");

        System.out.println(list.containsAll(list1));

        list.addAll(list1);
        System.out.println(list);
        list.removeAll(list1);
        System.out.println(list);

        list.retainAll(list1);
        System.out.println(list);
    }

    /**
     * List的一些方法
     */
    public static void test03(){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        System.out.println(list);

        list.add(2,"小样");
        System.out.println(list);

        list.set(2,"xiaoyoung");
        System.out.println(list);

        list.remove("xiaoyoung");
        System.out.println(list);

        list.add("C");
        list.add("B");
        list.add("A");
        System.out.println(list.get(1));
        System.out.println(list.indexOf("A"));
        System.out.println(list.lastIndexOf("A"));
    }
}
