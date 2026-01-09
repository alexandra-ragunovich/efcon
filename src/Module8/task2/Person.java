package Module8.task2;

public class Person {
    private String name;
    private String surname;
    private Integer age;
Person(String name, String surname,Integer age){
    this.name=name;
    this.surname=surname;
    this.age=age;
}
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
}
