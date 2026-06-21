//TIP To <b>Run</b> code, pres
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n" + "Задание 1:" + "\n");
        // Задание 1
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number :" + i);
        }
        System.out.println("\n" + "Задание 2:" + "\n");
        // Задание 2

        for (int i = 10; i >= 1; i--) {
            System.out.println("Number :" + i);
        }
        System.out.println("\n" + "Задание 3:" + "\n");
        // Задание 3
        for (int i = 0; i <= 17; i++) {
            if (i % 2 != 0)
                continue;
            System.out.println("Number :" + i);
        }
        System.out.println("\n" + "Задание 4:" + "\n");
        // Задание 4
        for (int i = 10; i >= -10; i--) {
            System.out.println("Number :" + i);
        }
        System.out.println("\n" + "Задание 5:" + "\n");
        // Задание 5

        for (int i = 1904; i <= 2096; i += 4) {

            System.out.println(i + " Год является високосным");

        }
        System.out.println("\n" + "Задание 6:" + "\n");
        // Задание 6

        for (int i = 7; i <= 98; i += 7) {

            System.out.println("Number :" + i);
        }
        System.out.println("\n" + "Задание 7:" + "\n");
        // Задание 7

        for (int i = 1; i <= 512; i *= 2) {
            System.out.println("Number :" + i);
        }
        System.out.println("\n" + "Задание 8:" + "\n");
        // Задание 8

        double totalSavings = 0;
        double many = 29000;
        for (double month = 1; month <= 12; month++) {
            totalSavings += many;


            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalSavings + " рублей");
        }
        System.out.println("\n" + "Задание 9:" + "\n");
        // Задание 9


        double total = 0;
        double salary = 29000;
        for (double month = 1; month <= 12; month++) {
            salary = salary + (salary * 0.01);
            total += salary;


            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        System.out.println("\n" + "Задание 10:" + "\n");
        // Задание 10

        int num1 = 2;
        int res;
        for (int num2 = 1; num2 <= 10; num2++) {
            res = num1 * num2;
            System.out.println(num1 + "*" + num2 + "=" + res);

        }
    }
}
