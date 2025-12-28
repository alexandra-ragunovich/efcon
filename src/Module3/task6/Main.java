package Module3.task6;
import java.util.Date;

public class Main {
    public static void main(String[] args){
        String text="";
Date beginFirst=new Date();
        for (int i = 0; i < 1000000; i++) {
            text += "aaabbbccc";
        }
        Date endFirst=new Date();
        StringBuilder stringBuilder = new StringBuilder();
        Date beginSecond=new Date();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("aaabbbccc");
        }
        Date endSecond=new Date();
        System.out.println("Время выполнения с String (+): " + (endFirst.getTime()-beginFirst.getTime()) + " мс");
        System.out.println("Время выполнения с StringBuilder (append): " + (endSecond.getTime()-beginSecond.getTime()) + " мс");
        if ((endFirst.getTime()-beginFirst.getTime()) > (endSecond.getTime()-beginSecond.getTime())) {
            System.out.println("StringBuilder быстрее примерно в " + ((endFirst.getTime()-beginFirst.getTime()) / (endSecond.getTime()-beginSecond.getTime())) + " раз.");
        }

    }
}
