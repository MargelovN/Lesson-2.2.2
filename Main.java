public class Main {

    public static void main(String[] args) {

        int initialAmount = 100;
        int deposit = 1100;
        int bonus;

        if (deposit < 1000) {
            bonus = 0;
        } else {
            bonus = deposit / 100;
        }
        int totalAmount = initialAmount + deposit + bonus;
        System.out.println("Всего средств:" + totalAmount + "руб.");
        System.out.println("Бонусы:" + bonus + "руб.");
    }
}