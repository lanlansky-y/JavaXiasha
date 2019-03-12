package LessonString;
/*
String类的比较
 */
public class TestString {
    public static void main(String[] args) {
        String str1 = "yyz";
        String str2 = "yyz";
        String str3 = new String("yyz");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
    }
}
