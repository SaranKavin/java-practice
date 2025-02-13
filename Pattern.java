public class Pattern {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(new String(new char[i]).replace("\0", "A").replaceAll("A", String.format("%c", 'A' + (i - 1))));
        }
    }
}
