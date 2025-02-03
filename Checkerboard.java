public class Checkerboard {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print((i + j) % 2 == 0 ? "* " : "  ");
            }
            System.out.println();
        }
    }
}
