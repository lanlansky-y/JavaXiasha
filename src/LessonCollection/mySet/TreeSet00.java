package LessonCollection.mySet;

import java.util.Set;
import java.util.TreeSet;

/**
 * @Description: TreeSet的使用和底层原理，以及comparable接口的使用
 * @author: Yang Yuzhou
 * @date: 2019/3/21
 */
public class TreeSet00 {
    public static void main(String[] args) {
        Set<Integer> set1 = new TreeSet<>();
        set1.add(100);
        set1.add(300);
        set1.add(200);

        System.out.println(set1);

        Set<Emp> set2 = new TreeSet<>();
        set2.add(new Emp(100,"张三", 8000));
        set2.add(new Emp(200,"李四", 6000));
        set2.add(new Emp(50,"王五", 9000));
        set2.add(new Emp(80,"赵六", 8000));
        System.out.println(set2);
    }

}

class Emp implements Comparable<Emp>{
    int id;
    String name;
    double salary;

    public Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:"+this.id+", name:"+this.name+", salary:"+this.salary;
    }

    @Override
    public int compareTo(Emp o) {
        if(this.salary>o.salary){
            return 1;
        }else if(this.salary<o.salary){
            return -1;
        }else if(this.id>o.id){
            return 1;
        }else if(this.id<o.id){
            return -1;
        }else {
            return 0;
        }
    }
}
