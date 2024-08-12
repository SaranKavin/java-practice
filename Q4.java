import java.util.Scanner;
class Q4{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        float marks = scan.nextInt();
        scan.nextLine();
        String dept = scan.nextLine();
    //    float m = marks%10;
        System.out.println("My Name is"+name);
        System.out.println("My Score is"+marks/10);
           System.out.println("My dept is"+dept);

    }
}