package Module9.task2;

public class Person {
    private String name;
    private String surname;
    private int age;
    Person(String name, String surname, int age) throws PersonAgeException{
        this.name=name;
        this.surname=surname;
        this.age=age;
        if (age < 0) {
            throw new PersonAgeException("Возраст не может быть отрицательным: " + age);
        }
    }
}
