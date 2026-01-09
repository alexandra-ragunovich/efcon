package Module9.task2;

public class Main {
    public static void main(String[] args){
        try{
            Person person=new Person("Dima","Ivanov",-10);
        }
        catch (PersonAgeException e){
            System.out.println("Исключение поймано: " + e.getMessage());
        }
    }

}
