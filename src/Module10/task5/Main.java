package Module10.task5;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        Random random = new Random();

        for (int taskNumber = 1; taskNumber <= 10; taskNumber++) {

            final int number = taskNumber;

            Callable<String> task = () -> {
                String threadName = Thread.currentThread().getName();
                System.out.println(threadName + " начал задачу " + number);

                int sum = 0;
                List<Integer> numbers = new ArrayList<>();

                for (int i = 0; i < 10; i++) {
                    int value = random.nextInt(100);
                    numbers.add(value);
                    sum += value;
                }

                int sleep = random.nextInt(10) + 1;
                Thread.sleep(sleep * 1000);

                System.out.println(threadName +
                        " завершил задачу " + number +
                        " | числа: " + numbers +
                        " | сумма: " + sum);

                return "Сумма = " + sum;
            };

            executor.submit(task);
        }

        executor.shutdown();
        System.out.println("Все задачи отправлены в пул");
    }
}
