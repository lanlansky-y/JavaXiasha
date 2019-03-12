package LessonException;

import java.io.FileNotFoundException;
import java.io.FileReader;

/*
捕获FileNotFoundException异常
 */
public class TestException {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("E:/a/a.txt");

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

    }
}
