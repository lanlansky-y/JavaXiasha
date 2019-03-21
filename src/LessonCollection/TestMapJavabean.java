package LessonCollection;

import java.util.*;

/**
 * @Description: 测试表格数据的存储，体会ORM思想，每一行用javabean存储，再存入Map或者List中
 * @author: Yang Yuzhou
 * @date: 2019/3/21
 */
public class TestMapJavabean {
    public static void main(String[] args) {
        User user1 = new User(1001, "张三", 20000, "2019.8.30");
        User user2 = new User(1002, "李四", 30000, "2018.9.30");
        User user3 = new User(1003, "王五", 5000, "2020.5.30");
        User user4 = new User(1004, "赵六", 8000, "2021.1.30");

        //Map
        Map<Integer, User> map = new HashMap<>();
        map.put(1, user1);
        map.put(2, user2);
        map.put(3, user3);
        map.put(4, user4);
        Set<Integer> keySet = map.keySet();
        for (Integer key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }

        System.out.println("**********");

        //List
        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        System.out.println(list);
        for (User user : list) {
            System.out.println(user);
        }
    }
}

class User {

    private int id;
    private String name;
    private int salary;
    private String hireDate;

    public User(int id, String name, int salary, String hireDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getHireDate() {
        return hireDate;
    }

    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "id：" + this.id + "，姓名：" + this.name + "，薪水：" + this.salary + "，入职日期：" + this.hireDate;
    }
}
