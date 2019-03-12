package LessonEnum;
/*
枚举的用法
 */
public class TestEnum {
    public static void main(String[] args) {
        SPORTS sports = SPORTS.BASKETBALL;

        switch(sports){
            case TENNIS:
                System.out.println("打网球");
                break;
            case BASEBALL:
                System.out.println("打棒球");
                break;
            case FOOTBALL:
                System.out.println("踢足球");
                break;
            case BASKETBALL:
                System.out.println("打篮球");
                break;
                default:
                    System.out.println("回家睡觉");
        }
    }
}


enum Season{
    SPRING,SUMMER,AUTUMN,WINTER
}

enum SPORTS{
    BASKETBALL,FOOTBALL,BASEBALL,TENNIS
}
