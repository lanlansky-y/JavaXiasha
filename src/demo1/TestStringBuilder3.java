package demo1;

/**
 * 字符串可变序列和不可变序列的使用陷阱
 */
public class TestStringBuilder3 {
    public static void main(String[] args) {

        String str="";
        StringBuilder str1=new StringBuilder();


        long num1=Runtime.getRuntime().freeMemory();//获取当前系统的剩余内存
        long time1=System.currentTimeMillis();//获取当前时间

        for (int i = 0; i < 5000; i++) {
            str=str+i;                      //相当于产生了10000个对象
        }

        long num2=Runtime.getRuntime().freeMemory();
        long time2=System.currentTimeMillis();

        System.out.println("耗费的内存："+(num1-num2));
        System.out.println("耗费的时间："+(time2-time1));

        System.out.println("*******************");

        long num3=Runtime.getRuntime().freeMemory();
        long time3=System.currentTimeMillis();
        for (int i = 0; i < 5000; i++) {
            str1.append(i);
        }
        long num4=Runtime.getRuntime().freeMemory();
        long time4=System.currentTimeMillis();
        System.out.println("耗费的内存："+(num3-num4));
        System.out.println("耗费的时间："+(time4-time3));



    }
}
