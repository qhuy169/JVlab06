import java.util.Random;
import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Bạn muốn nhập mảng bằng tay hay tự động? (1: Tay, 2: Tự động)");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Nhập các phần tử cho mảng:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Phần tử thứ " + (i + 1) + ": ");
                arr[i] = scanner.nextInt();
            }
        } else {
            System.out.println("Mảng tự động nhập:");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random.nextInt(100); // Random số nguyên từ 0 đến 99
            }
        }

        System.out.println("Mảng vừa nhập:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
