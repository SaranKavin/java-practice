import java.util.Scanner;
class Q8{
    public static void main (String args[])
    {
    Scanner scan =new Scanner(System.in);
    int num1 = scan.nextInt();
    if(num1 % 3 == 0 && num1 % 5 == 0){
        System.out.println(true);
    }
    else{
        System.out.println(false);
    }
    }
}
