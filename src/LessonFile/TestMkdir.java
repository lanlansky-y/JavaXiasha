package LessonFile;

import java.io.File;

/*
mkdir()和mkdirs()的区别
mkdir() 如果你想在已经存在的文件夹下建立新的文件夹（2010-02-28文件夹），
就可以用此方法。此方法不能在不存在的文件夹下建立新的文件夹。假如想建立名字
是”2010-02-28”文件夹，那么它的父文件夹必须存在。

mkdirs() 如果你想根据File里的路径名建立文件夹（当你不知道此文件夹是否存在，
也不知道父文件夹存在），就可用此方法，它建立文件夹的原则是：如果父文件夹不存在
并且最后一级子文件夹不存在，它就自动新建所有路经里写的文件夹；如果父文件夹存在，
它就直接在已经存在的父文件夹下新建子文件夹。
 */
public class TestMkdir {
    public static void main(String[] args) {
        File file = new File("E:/Develop/a/a.txt");
        boolean b = file.mkdir();
        System.out.println(b);
        File dir = file.getParentFile();
        boolean b1 = dir.mkdirs();
        System.out.println(b1);
    }
}
