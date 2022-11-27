public class Main {
    // 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void getNumber(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    // Составить алгоритм: если введенное имя совпадает с Вячеслав,
    // то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    public static void name(String name) {
        if (name == "Вячеслав") {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }


    public static void main(String[] args) {

        Main.getNumber(9);
        Main.name("Вячеслав");

    }
}