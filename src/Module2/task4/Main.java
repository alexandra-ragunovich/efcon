package Module2.task4;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i< arr.length;i++){
            if (i < n / 2) {
                for (int j = 0; j <= i; j++) {
                    arr[i][j] = 1;
                    arr[i][n - 1 - j] = 1;
                }
            } else {
                for (int j = 0; j < n - i; j++) {
                    arr[i][j] = 1;
                    arr[i][n - 1 - j] = 1;
                }


            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            } System.out.println();
        }
    }
}
