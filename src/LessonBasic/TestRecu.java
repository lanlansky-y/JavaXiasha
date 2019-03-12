package LessonBasic;
/*
递归的练习:
递归一定要有1.递归头(递归的结束条件)，2.递归体(什么时候
需要调用自身方法)
简单的程序是递归的优点之一，但是递归调用会占用大量的系统堆栈，
内存耗用多，而且速度比循环慢得多，所以尽量不要用递归。
 */
public class TestRecu {
    public static void main(String[] args) {
        int n = recursion(5);
        System.out.println(n);
    }

    static int recursion(int n){
        if(n==1){
            return 1;
        }

        return n*recursion(n-1);
    }
}
