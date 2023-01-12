import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int size = scanner.nextInt();
        int[] inputArray = new int[size];

        System.out.println("Элементы массива:");
        for (int i = 0; i < size; i++) {
            inputArray[i] = i + 1;
            System.out.print(inputArray[i]+ " ");
        }
        System.out.println();
        System.out.println("Элементы массива, кратные 3: ");
        for (int j : inputArray) {
            if (j % 3 == 0) {
                System.out.print(j + " ");
            }
        }
    }
}

