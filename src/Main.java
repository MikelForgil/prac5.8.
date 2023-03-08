    //Завдання1
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть ціле число: ");
        int n = scanner.nextInt();
        if (n > 50 && n < 100) {
            System.out.println("Число " + n + " міститься на проміжку(50:100)");
        } else {
            System.out.println("Число " + n + " не міститься на проміжку(50:100)");
        }

    }
}

    //Завдання2
public class Main {
    public static void main(String[] args){
        int n = 123;
        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit){
                maxDigit = digit;
            }
            n /= 10;
        }
        System.out.println("Найбільша цифра в числі " + n + " : " +maxDigit);
    }
}

    //Завдання3
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentFloor = 1;

        System.out.println("Ліфт стоїть на 1 поверсі.");
        while (true) {
            System.out.println("Введіть номер поверху, на який ви хочете поїхати (1-9): ");
            int destinationFloor = scanner.nextInt();

            if (destinationFloor == 2) {
                System.out.println("Кнопка на 2 поверсі не працює. Ліфт їде на 3 поверх.");
                destinationFloor = 3;
            }

            if (destinationFloor < 1 || destinationFloor > 9) {
                System.out.println("Ви ввели неправильний номер поверху. Спробуйте ще раз.");
            } else if (destinationFloor == currentFloor) {
                System.out.println("Ви уже знаходитесь на цьому поверсі.");
            } else {
                if (destinationFloor > currentFloor) {
                    System.out.println("Ліфт піднімається на " + destinationFloor + " поверх.");
                    for (int i = currentFloor + 1; i <= destinationFloor; i++) {
                        System.out.println("Ви піднялися на " + i + " поверх.");
                    }
                } else {
                    System.out.println("Ліфт спускається на " + destinationFloor + " поверх.");
                    for (int i = currentFloor - 1; i >= destinationFloor; i--) {
                        System.out.println("Ви спустилися на " + i + " поверх.");
                    }
                }
                currentFloor = destinationFloor;
            }
        }
    }
}

    //Завдання4
import java.util.Scanner;

    public class ConditionalMenu {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введіть ваш вибір: ");
            String choice = scanner.nextLine().toLowerCase();

            switch (choice) {
                case "так":
                case "ок":
                case "yes":
                case "y":
                case "+":
                case "ok":
                    System.out.println("Я погоджуюсь!");
                    break;
                case "ні":
                case "no":
                case "n":
                case "-":
                    System.out.println("Я відмовляюсь!");
                    break;
                default:
                    System.out.println("Неправильний вибір!");
            }
        }
    }