import java.util.Arrays;
import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử cho mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Mảng sau khi sắp xếp tăng dần:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
