public class Main {
    public static void main(String[] args) {

        task01();
        task02();
        task03();
        task04();

    }

    private static void task04() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        String employeeName = "";
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            employeeName += reverseFullName[i];
        }
        System.out.println(employeeName);
    }

    private static void task03() {
        int[] arr = generateRandomArray();
        double averageSalaryInAMonth;
        int sum = 0, daysInAMonth = 30;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        averageSalaryInAMonth = (double) sum / daysInAMonth;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageSalaryInAMonth);
        space(0);
    }

    private static void task02() {
        int[] arr = generateRandomArray();
        int max = arr[0], min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
            // System.out.print(arr[i] + " ");
        }
        // space(0);
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей.", min, max);
        space(0);
    }

    private static void task01() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int value: arr) {
            sum = sum + value;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей.", sum);
        space(0);
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void space(int lines) {
        for (int i = 0; i <= lines; i++) {
            System.out.println();
        }
    }
}