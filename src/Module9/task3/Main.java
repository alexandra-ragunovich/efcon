package Module9.task3;


public class Main {
    public static void main(String[] args){
        try{
            createPerson("Dima", "Ivanov", -10);
        }
        catch (PersonAgeException e){
            System.out.println("Исключение поймано: " + e.getMessage());
        }
    }
    public static void createPerson(String name, String surname, int age) throws PersonAgeException
    {
        new Person(name, surname, age);
    }
}
