import java.util.Random;

public class Bai2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[10];

        System.out.println("Mảng tự động nhập:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
