package Module11.task1;

import java.lang.reflect.Field;

public class Man {
    private String name;
    private String surname;
    private int age;
    private String profession;
    Man(String name, String surname, int age,String profession){
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.profession = profession;
    }
    private void printInfo() {
        Field[] fields = getClass().getDeclaredFields();

        for (Field field : fields) {
            try {
                field.setAccessible(true);
                System.out.println(field.getName() + ": " + field.get(this));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
