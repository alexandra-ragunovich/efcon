package Module10.task6;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int k = 1; k <= 10; k++) {

            final int taskNumber = k;

            Callable<String> task = () -> {
                String text = "Hello World " + new Date() + " | Задача " + taskNumber + "\n";

                writeInFile(text);

                System.out.println("Поток: " + Thread.currentThread().getName() +
                        " выполнил задачу " + taskNumber);

                return text;
            };

            executor.submit(task);
        }

        executor.shutdown();
    }


    public static synchronized void writeInFile(String text) {
        String filePath = "File.txt";
        File file = new File(filePath);

        try (FileOutputStream fos = new FileOutputStream(file, true)) {
            fos.write(text.getBytes());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}

