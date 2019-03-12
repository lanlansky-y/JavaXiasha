package demo1;

public class IntegerNum {
    public static void main(String[] args){

//        IntegerNum.testInteger();
        IntegerNum.testIntegerCache();

    }

    public static void testInteger(){
        Integer a=new Integer(1);

        Integer b=Integer.valueOf(3);
        System.out.println(a+b);

        Integer c=new Integer("11");
        System.out.println(c);
        String d=c.toString();
        System.out.println(d+c);
    }

    public static void testIntegerCache(){
        /*
        valueOf()之间缓存了[-128,127]之间的值
        当我们调用valueOf()时，首先会检查值是否在[-128,127]之间，
        如果在这个范围内，则直接取出该值，否则就会创建一个新的对象，
         */
        Integer i1=-128;
        Integer i2=-128;
        System.out.println(i1==i2);
        System.out.println(i1.equals(i2));

        Integer j1=235;
        Integer j2=235;
        System.out.println(j1==j2);
        System.out.println(j1.equals(j2));

    }



}
