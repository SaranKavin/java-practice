import java.util.Scanner;
class operators{
  
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        // a++     pre-incerment
        // ++a     post-incerment
        int a1=5;
        int result=a1++;
        System.out.println(result);
        // a++     pre-incerment     value assigned and then incremented
        // ++a     post-incerment    incrementen and assign the value
        int a;
        int b;
        System.out.println("Enter num 1");
        a=scan.nextInt();
        a+=5; // is similer to a=a+5;
        System.out.println("num 1 incremented by 5"+a);
        System.out.println("Enter num 2");
        b=scan.nextInt();
        System.out.println("addition is "+(a+b));
        System.out.println("Subraction id "+(a-b));
        System.out.println("Multiplication id "+(a*b));
        System.out.println("Division id "+(a/b));
    }
}