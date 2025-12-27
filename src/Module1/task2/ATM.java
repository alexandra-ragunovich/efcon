package Module1.task2;
import java.util.Scanner;

public class ATM {
    private int banknote20;
    private int banknote50;
    private int banknote100;
public ATM(int banknote20,int banknote50, int banknote100){
    this.banknote20=banknote20;
    this.banknote50=banknote50;
    this.banknote100=banknote100;
}
public void addBanknote(int add20, int add50, int add100){
    banknote20+=add20;
    banknote50+=add50;
    banknote100+=add100;

}
public boolean withdraw(int money){
    int need100 = 0, need50 = 0, need20 = 0;
    int sum = money;
    need100 = Math.min(sum / 100, banknote100);
    sum -= need100 * 100;
    need50 = Math.min(sum / 50, banknote50);
    sum -= need50 * 50;
    need20 = Math.min(sum / 20, banknote20);
    sum -= need20 * 20;
    if (sum == 0){
        banknote100 -= need100;
        banknote50 -= need50;
        banknote20 -= need20;
    System.out.println("Выдача:");
    if (need100 > 0) System.out.println("100 x " + need100);
    if (need50 > 0) System.out.println("50 x " + need50);
    if (need20 > 0) System.out.println("20 x " + need20);
    return true;
    }
    else {
        System.out.println("Операция не удалась: нет денег в автомате.");
        return false;
    }
}
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ATM atm = new ATM(10, 5, 2);
    boolean work = true;
    while (work) {
        System.out.println("\nМеню:");
        System.out.println("1 - Снять деньги");
        System.out.println("2 - Добавить деньги");
        System.out.println("0 - Выход");
        System.out.print("Ваш выбор: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Введите сумму для снятия: ");
                int amount = sc.nextInt();
                boolean success = atm.withdraw(amount);
                System.out.println("Операция успешна? " + success);
                break;
            case 2:
                System.out.print("Введите количество купюр 20: ");
                int add20 = sc.nextInt();
                System.out.print("Введите количество купюр 50: ");
                int add50 = sc.nextInt();
                System.out.print("Введите количество купюр 100: ");
                int add100 = sc.nextInt();
                atm.addBanknote(add20, add50, add100);
                break;

            case 0:
                work = false;
                System.out.println("Спасибо за использование банкомата!");
                break;
            default:
                System.out.println("Неверный выбор, попробуйте снова."); }
    }
}
}