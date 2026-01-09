package Module9.task4;
import java.io.*;

public class Main {
    public static void main(String[] args){
        File directory = new File("/Users/alexandra/Desktop/аипрп");
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Каталоги:");
                for (File file : files) {
                    if (file.isDirectory()) {
                        System.out.println(file.getName());
                    }
                }

                System.out.println("\nФайлы:");
                for (File file : files) {
                    if (file.isFile()) {
                        System.out.println(file.getName());
                    }
                }
            } else {
                System.out.println("Каталог пуст");
            }
        } else {
            System.out.println("Указанный путь не является каталогом.");
        }
    }
}
