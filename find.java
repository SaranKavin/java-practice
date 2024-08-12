import java.util.Scanner;

public class find {
    
    void evenorodd(int num){
        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        find obj1= new find();
        obj1.evenorodd(number);
        
    }
}
