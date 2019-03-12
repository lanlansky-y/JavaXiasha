package LessonFile;
/*
File的一些操作命令
 */
import java.io.File;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) throws IOException {

        File file = new File("e:/a.txt");
        file.createNewFile();

        System.out.println("文件是否存在：" + file.exists());
        System.out.println("文件是否是目录：" + file.isDirectory());
        System.out.println("文件是否是文件：" + file.isFile());
        System.out.println("文件的名字：" + file.getName());
        System.out.println("文件最后修改时间：" + new Date(file.lastModified()));
        System.out.println("文件的大小：" + file.length());
        System.out.println("文件的相对地址：" + file.getPath());
        System.out.println("文件的绝对地址：" + file.getAbsolutePath());
        //删除创建的文件
        file.delete();
    }


}
