public class Main {
    // 1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    public static void getNumber(int number) {
        if (number > 7) {
            System.out.println("Привет");
        }
    }

    // 2. Составить алгоритм: если введенное имя совпадает с Вячеслав,
    //    то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    public static void name(String name) {
        if (name == "Вячеслав") {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    // 3. Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    public static void massiveOfNumbers() {
        int numbers[]=new int[] {3, 4, 5, 6, 7, 8, 9, 21};

        for (int i = 0; i < numbers[i]; i++)
            if(numbers[i] % 3 == 0)

                System.out.println(numbers[i]);
    }

    public static void main(String[] args) {

        Main.getNumber(9);
        Main.name("Вячеслав");
        Main.massiveOfNumbers();

    }
}