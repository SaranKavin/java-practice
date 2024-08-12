import java.util.Scanner;

class array {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i = i + 1) {
            arr[i] = scan.nextInt();
        }
        // int arra = arr.length/2;
        System.out.println(arr[num/2]);
    }
}
