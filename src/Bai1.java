import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Nhập 10 phần tử cho mảng:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        System.out.println("Mảng vừa nhập:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
