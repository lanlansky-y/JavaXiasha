package LessonFile;

import java.io.File;
import java.io.IOException;

/*
File类的综合练习
 */
public class TestZonghe {
    public static void main(String[] args) throws IOException {
        File file = new File("e:/a/b/b.txt");

        boolean flag = file.exists();

        if (flag) {
            //如果存在，就删除文件
            boolean shanchu = file.delete();
            if(shanchu){
                System.out.println("文件删除成功！");
            }else {
                System.out.println("文件删除失败！");
            }
        }else {
            File parentFile = file.getParentFile();
            parentFile.mkdirs();
            boolean chuangJian = file.createNewFile();
            if(chuangJian){
                System.out.println("文件创建成功！");
            }else {
                System.out.println("文件创建失败！");
            }
        }

    }
}
