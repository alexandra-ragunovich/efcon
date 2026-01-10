package Module11.task3;

import java.lang.reflect.Method;

public class Main {
    public static void  main(String[] args ){
        Department d=new Department();
        Method[] methods=d.getClass().getDeclaredMethods();
        for(Method method:methods){
            try{
               if(method.isAnnotationPresent(departmentInfo.class)){
departmentInfo annotation=method.getAnnotation(departmentInfo.class);
                   System.out.println("Метод: "+method.getName()+" с аннтотацией "+annotation.year());
               }
               else{
                   System.out.println("Метод: "+method.getName()+" без аннтотацией");
               }
            } catch (Exception e) {
               System.out.println(e.getMessage());
            }
        }
    }
}
