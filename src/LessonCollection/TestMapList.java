package LessonCollection;

import java.util.*;

/**
 * @Description: 测试表格数据的存储，体会ORM思想，用Map存储每个员工的信息，再存入List中
 * @author: Yang Yuzhou
 * @date: 2019/3/21
 */
public class TestMapList {
    public static void main(String[] args) {
        Map<String, Object> row1 = new HashMap<>();
        row1.put("工号", 1001);
        row1.put("姓名", "张三");
        row1.put("薪水", 10000);
        row1.put("入职日期", "2019.8.30");

        Map<String, Object> row2 = new HashMap<>();
        row2.put("工号", 1002);
        row2.put("姓名", "李四");
        row2.put("薪水", 15000);
        row2.put("入职日期", "2020.8.30");

        Map<String, Object> row3 = new HashMap<>();
        row3.put("工号", 1003);
        row3.put("姓名", "王五");
        row3.put("薪水", 20000);
        row3.put("入职日期", "2021.8.30");

        Map<String, Object> row4 = new HashMap<>();
        row4.put("工号", 1004);
        row4.put("姓名", "赵六");
        row4.put("薪水", 30000);
        row4.put("入职日期", "2022.8.30");

        List<Map<String, Object>> list = new ArrayList<>();
        list.add(row1);
        list.add(row2);
        list.add(row3);
        list.add(row4);

        System.out.println(list);

        for (Map<String, Object> map:list) {
            Set<String> keySet = map.keySet();
            for (String key:keySet) {
                System.out.print(key+":"+map.get(key)+",");
            }
            System.out.println();
        }
    }
}
