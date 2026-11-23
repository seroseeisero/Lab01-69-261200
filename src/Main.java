
import java.util.Scanner;

public class Main {

    public static void bubbleSort(int[] numbers) {
        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }

            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        bubbleSort(numbers);

        for (int i = 0; i < n; i++) {
            System.out.println(numbers[i]);
        }

        sc.close();
    }
}
