public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void task1() {
        System.out.println("Задание 1");
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }

        System.out.println("Сумма трат за месяц составила "+ sum +" рублей");
        // int[] arr — объявление массива
        // generateRandomArray() — вызов метода «сгенерироватьМассив»
        // Далее пишем код для задачи
    }
    public static void task2() {
        System.out.println("Задание 2");
        int[] arr = generateRandomArray();
        int min = 200_000;
        int max = 100_000;
        for (int i=0;i<arr.length;i++) {
           if (min>arr[i]) {
               min = arr[i];
           }
           if (max<arr[i]) {
               max = arr[i];
           }
        }
        System.out.println("Минимальная сумма трат за день составила "+min+"рублей. Максимальная сумма трат за день составила "+max+" рублей");
    }
    public static void task3() {
        System.out.println("Задание 3");
        int[] arr = generateRandomArray();
        double sum = 0;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        sum /= arr.length;
        System.out.format("Средняя сумма трат за месяц составила %.2f рублей \n",sum);
    }

    public static void task4() {
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i=reverseFullName.length-1;i>=0;i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}