import java.util.Scanner;
class operators{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter num 1");
        a=scan.nextInt();
        System.out.println("Enter num 2");
        b=scan.nextInt();
        System.out.println("addition is "+(a+b));
        System.out.println("Subraction id"+(a-b));
        System.out.println("Multiplication id"+(a*b));
        System.out.println("Division id"+(a/b));
    }
}