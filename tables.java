import java.util.Scanner;
class array{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter table number");
        int num=scan.nextInt();
        for (int i=1;i<=10;i=i+1)
       
        {
            System.out.println(i+"x"+num+"="+num*i);
        }
    }
}


