package demo1;

public class TestStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("abcdefg");
        int sb1=sb.indexOf("a");
        int sb2=sb.indexOf("f",2);
        String str=sb.substring(2);
        String str1=sb.substring(2, 3);
        char ch=sb.charAt(6);

        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(str);
        System.out.println(str1);
        System.out.println(ch);
    }
}
