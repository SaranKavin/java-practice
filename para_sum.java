import java.util.Scanner;

public class para_sum {

    void sum(int a,int b){
        System.out.println("num1 is "+a);
        System.out.println("num2 is "+b);
        System.out.println("sum "+(a+b));
        System.out.println("sub "+(a-b));
        System.out.println("multi "+a*b);
        System.out.println("div "+a/b);

    }

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);

        para_sum obj=new para_sum();

        int a= scan.nextInt();
        int b= scan.nextInt();

        obj.sum(a,b);
        

    }
}
