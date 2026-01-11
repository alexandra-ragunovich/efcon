package Module10.task4;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
public class Main {

    public static void main(String[] args) {

        String[] strings = {
                "Hello\n",
                "How are you\n",
                "What do you do\n",

        };

        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int taskNumber = 1; taskNumber <= 10; taskNumber++) {

            final int number = taskNumber;

            Callable<ArrayList<String>> task = () -> {
                ArrayList<String> fileNames = new ArrayList<>();
                Random random = new Random();

                for (int i = 1; i <= 10; i++) {
                    String filePath = "/Users/alexandra/Desktop/эфкон/efcon" + number + "_File_" + i + ".txt";
                    File file = new File(filePath);

                    try (FileOutputStream fos = new FileOutputStream(file)) {
                        for (int j = 0; j < 10; j++) {
                            String line = strings[random.nextInt(strings.length)];
                            fos.write(line.getBytes());
                        }
                    }

                    fileNames.add(file.getName());
                }

                int sleepTime = random.nextInt(2001) + 1000;
                Thread.sleep(sleepTime);

                System.out.println("Поток " + Thread.currentThread().getName()
                        + " выполнил задачу " + number);

                return fileNames;
            };

            executor.submit(task);
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Программа завершена");
    }
}