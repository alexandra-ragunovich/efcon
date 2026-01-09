package Module9.task5;
import java.io.*;
import java.util.regex.*;

public class Main {
    public static void main(String[] args){
       String filePath="/Users/alexandra/Desktop/эфкон/efcon/src/Module9/text.txt";
        try (OutputStreamWriter writer = new OutputStreamWriter(new FileOutputStream(filePath), "UTF-8")) {
            writer.write("ПРимер текста, сегодня снегопад и холодно!");

       }catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       }
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"))) {
            StringBuilder contentBuilder = new StringBuilder();
            String line;

            System.out.println("Содержимое файла:");
            while ((line = bufferedReader.readLine()) != null) {
                contentBuilder.append(line).append("\n");
                System.out.println(line);
            }

           String content = contentBuilder.toString();

           System.out.println("\n");

           String[] words = content.split("\\s+");
           int wordCount = words.length;
           Pattern pattern = Pattern.compile("\\p{Punct}");
           Matcher matcher = pattern.matcher(content);
           int nPunctuation = 0;
           while (matcher.find()) {
               nPunctuation++;
           }
           System.out.println("Количество слов: " + wordCount);
           System.out.println("Количество знаков препинания: " + nPunctuation);

       } catch (Exception e) {
           System.out.println("Error: " + e.getMessage());
       }

    }
}
