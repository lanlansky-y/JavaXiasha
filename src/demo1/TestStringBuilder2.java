package demo1;

public class TestStringBuilder2 {

    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char temp=(char)('a'+i);
            sb.append(temp);
        }

        System.out.println(sb);

        //倒序
        sb.reverse();
        System.out.println(sb);
    }
}
