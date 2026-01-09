package Module9.task1;

public class Main {
    public static void main(String[] args){
        try{ int arr[]=null;
            System.out.println(arr[3]);
    } catch (NullPointerException e) {
            System.out.println("Ошибка :" +e.getMessage());
        }
}
}
