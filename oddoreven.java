import java.util.Scanner;
class oddoreven{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        if(num%2==0){
            System.out.println("Num is Even");
        }
        else{
             System.out.println("Num is Odd");
        }
    }
}