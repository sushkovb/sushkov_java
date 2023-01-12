## Задание 1

Составить алгоритм: если введенное число больше 7, то вывести “Привет”

```yaml
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Введите число: ");
          double number = scanner.nextDouble();

          if (number > 7) {
              System.out.println("Привет");
          }
      }
```
## Задание 2

Составить алгоритм: если введенное имя совпадает с Вячеслав, 
то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"

```yaml
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        if (name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
```
## Задание 3

Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3

```yaml
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
```

## Задание 4

Дана скобочная последовательность: [((())()(())]]
- Можно ли считать эту последовательность правильной?
- Если ответ на предыдущий вопрос “нет” - то что необходимо в ней изменить, чтоб она стала правильной?

Ответ: Нет. Каждая открывающая скобка должна иметь справа такую же закрывающую. В указанной скобочной
последовательности имеется одна круглая скобка, не имеющая себе пары и одна квадратная. Чтобы скобочная
последовательность была правильной, можно либо удалить указанные скобки [(())()(())], либо заменить вторую
по счету скобку с круглой на квадратную [[(())()(())]].
