package LessonFile;

import java.io.File;

/*
用递归的方法，打印目录树
 */
public class LessonDiguiMulushu {
    public static void main(String[] args) {
        File f = new File("E:\\学习");
        printDir(f, 0);
    }
    public static void printDir(File f, int level){
        for (int i=0;i<level;i++){
            System.out.print("-");
        }
        System.out.println(f.getName());
        if(f.isDirectory()){
            File[] files = f.listFiles();
            for (int i = 0; i < files.length; i++) {

                printDir(files[i], level++);
            }
        }
    }
}
