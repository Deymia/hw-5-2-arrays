import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

    int[] arr = generateRandomArray();
}
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
// первое задание
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum +=arr[i];
        }
        System.out.println("Сумма трат за месяц: " + sum);
// второе задание
        int min = arr[0];
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Максимальная сумма: " + max);
        System.out.println("Минимальная сумма: " + min);
// третье задание
        float average = 0.0f;
        float sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 +=arr[i];
        }
        average = sum2 / arr.length;
        System.out.println("Среднее: " + average);

//четвертое задание
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i-- )
            System.out.print(reverseFullName[i]);

        return arr;
    }
}