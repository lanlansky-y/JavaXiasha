package LessonArray;
/*
数组的删除就是数组的拷贝
 */
public class TestArrayDelete {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c", "d", "e"};
        String[] s2 = new String[10];
        System.arraycopy( s1, 2, s2, 1, 3);
        for (int i = 0; i < s2.length; i++) {
            System.out.println(i + "-" + s2[i]);
        }

        System.arraycopy(s1, 3, s1, 2, 2);
        s1[4] = null;
        for (String s : s1) {
            System.out.println(s);
        }
        String[] s3 = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        arrayCopy(s3, 2);
    }

    /*
    定义一个方法实现删除数组中指定位置的元素并且打印数组，参数为数组和一个整数
     */
    public static void arrayCopy(String[] s, int num){
        System.arraycopy(s, num+1,s, num, s.length-num-1);
        s[s.length-1] = null;
        for (int i = 0; i < s.length; i++) {
            System.out.println(i+"-"+s[i]);
        }
    }
}
