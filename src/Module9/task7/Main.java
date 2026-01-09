package Module9.task7;
import java.io.*;
import java.util.regex.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        List<Person> people=new ArrayList<>();
        for (int i = 1; i < 11; i++) {
            people.add(new Person("Person " + i, "Surname person " + i, new Random().nextInt(15) + 15));
        }
        writePeople(people);
        printPeople();

    }
    public static void writePeople(List<Person> people){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/Users/alexandra/Desktop/эфкон/efcon/src/Module9/people.dat"))) {

            for (Person person : people) {
                oos.writeObject(person);
            }
        }
        catch (Exception ex) {

            System.out.println(ex.getMessage());
        }
    }
    public static void printPeople() {

        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream("/Users/alexandra/Desktop/эфкон/efcon/src/Module9/people.dat"))) {

            while (true) {
                Person p = (Person) ois.readObject();
                System.out.println( p.getName() + " " +p.getSurname() + ", age: " +p.getAge()
                );
            }
        }
        catch (EOFException e) {

        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}
