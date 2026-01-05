package Collection1.task5;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Map<String, Pet> pets = new HashMap<>();

         pets.put("Барсик", new Cat());
         pets.put("Шарик", new Dog());
         pets.put("Кеша", new Parrot());
         printKeys(pets);
    }
    public static void printKeys(Map<String, Pet> map) {
        System.out.println("Имена животных:");
        for (String key : map.keySet()) {
            System.out.println(key);
        }
    }
}
