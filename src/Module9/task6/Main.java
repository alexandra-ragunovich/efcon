package Module9.task6;
import java.io.*;
import java.util.regex.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        String filePath="/Users/alexandra/Desktop/эфкон/efcon/src/Module9/text1.txt";
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8")) {
            writer.write("ПРимер 66 текста 78, 6 7 5 9  сегодня снегопад  0 и 5 0 холодно!");

        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try(FileInputStream fin=new FileInputStream(filePath))
        {
            byte[] buffer = new byte[256];

            StringBuilder contentBuilder = new StringBuilder();
            int count;
            while((count=fin.read(buffer))!=-1){

                for(int i=0; i<count;i++){
                    contentBuilder.append((char) buffer[i]);
                }
            }
            String content = contentBuilder.toString();


            Pattern pattern = Pattern.compile("\\d+");
            Matcher matcher = pattern.matcher(content);
            List<Integer> numbers = new ArrayList<>();
            int sum = 0;

            System.out.println("Все найденные числа:");
            while (matcher.find()) {
                int number = Integer.parseInt(matcher.group());
                numbers.add(number);
                System.out.print(number + " ");
                sum += number;
            }
            System.out.println("\nСумма чисел: " + sum);
            Set<Integer> uniqueNumbers = new HashSet<>(numbers);
            System.out.println("Уникальные числа: " + uniqueNumbers);
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
}
}
