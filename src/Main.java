import java.util.Scanner;

enum DrinksMachine {
    КАВА, ЧАЙ, ЛИМОНАД, МОХІТО, МИНЕРАЛКА, КОКА_КОЛА;
}

public class Main {
    static final double PRICE_COFFEE = 12;
    static final double PRICE_TEA = 10;
    static final double PRICE_LEMONADE = 15;
    static final double PRICE_MOJITO = 25;
    static final double PRICE_MINERAL_WATER = 8;
    static final double PRICE_COCA_COLA = 20;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalQuantity = 0;
        double totalPrice = 0.0;

        while (true) {
            System.out.println("Виберіть напій (0 - завершити): ");
            System.out.println("1. Кава");
            System.out.println("2. Чай");
            System.out.println("3. Лимонад");
            System.out.println("4. Мохіто");
            System.out.println("5. Мінеральна вода");
            System.out.println("6. Кока-кола");

            int choice = scanner.nextInt();

            if (choice == 0) {
                break;
            }

            switch (choice) {
                case 1:
                    totalQuantity++;
                    totalPrice += PRICE_COFFEE;
                    System.out.println("Ваша кава заварюється...");
                    break;
                case 2:
                    totalQuantity++;
                    totalPrice += PRICE_TEA;
                    System.out.println("Ваш чай готується...");
                    break;
                case 3:
                    totalQuantity++;
                    totalPrice += PRICE_LEMONADE;
                    System.out.println("Приготування лимонаду...");
                    break;
                case 4:
                    totalQuantity++;
                    totalPrice += PRICE_MOJITO;
                    System.out.println("Приготування мохіто...");
                    break;
                case 5:
                    totalQuantity++;
                    totalPrice += PRICE_MINERAL_WATER;
                    System.out.println("Наливається мінеральна вода...");
                    break;
                case 6:
                    totalQuantity++;
                    totalPrice += PRICE_COCA_COLA;
                    System.out.println("Наливається кока-кола...");
                    break;
                default:
                    System.out.println("Неправильний вибір.");
            }
        }

        System.out.println("Ви замовили " + totalQuantity + " напоїв.");
        System.out.println("Загальна сума до оплати: " + totalPrice + " грн.");
    }
}