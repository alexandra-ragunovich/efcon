package Module8.task2;
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args){
List <Person> person=new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            person.add(new Person("Person " + i, "Surname person " + i, new Random().nextInt(15) + 15));
        }
        List<String> surnames= person.stream().filter(p -> p.getAge()<21)
                .peek(p -> System.out.println(p.getName() + ' ' + p.getSurname() + " Age: " + p.getAge()))
                .sorted(new PersonSurnameComparator().thenComparing(new PersonNameComparator()))
                .limit(4)
                .map(Person::getSurname)
                .collect(Collectors.toList());
        System.out.println("Фамилии выбранных студентов: " + surnames);
    }
}
