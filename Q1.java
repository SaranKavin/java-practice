import java.util.Scanner;
class Q1{
    public static void main(String args[])
    {

        //For Name
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        int age = scan.nextInt();
        scan.nextLine();
        String address = scan.nextLine();
        System.out.println("My Name is "+name);
        System.out.println("My age is "+age);
        System.out.println("My address is "+address);


    }
}