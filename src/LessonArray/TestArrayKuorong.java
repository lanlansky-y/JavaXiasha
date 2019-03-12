package LessonArray;
/*
数组的扩容，先定义一个更大的数组，然后将原数组拷贝到新数组中并插入新元素
 */
public class TestArrayKuorong {
    public static void main(String[] args) {
        String[] s = {"阿里", "腾讯", "百度", "京东", "头条", "亚马逊"};
        String str = "微软";
        String[] s1 = insertEle(s,0,str);
        for (int i = 0; i < s1.length; i++) {
            System.out.println(s1[i]);
        }
    }
    public static String[] insertEle(String[] s, int index, String str){
        String[] s1 = new String[s.length+1];
        System.arraycopy(s, 0,s1,0,index);
        System.arraycopy(s,index,s1,index+1,s.length-index);
        s1[index] = str;

        return s1;
    }
}

