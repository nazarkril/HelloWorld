import java.util.Random;

public class base2 {
    public static void main(String[] args) {
        System.out.println("Summary: " + method());
    }

    static int method() {
        int random = (int) (Math.random() * 15) + 5;
        int[] arr = new int[random];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 2000) - 1000;
            System.out.println("index " + i + " value " + arr[i]);
            sum += arr[i];
        }
        return sum;
    }
}
