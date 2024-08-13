import java.util.Scanner;
public class primenum {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
    int i=2;
    System.out.println("Enter a number");
    int num=scan.nextInt();
    boolean flag=false;
    if(num==0 || num==1 ){
    flag=true;
    }
    while(i<=num/2){
        if(num%i==0){
            flag=true;
            break;

        }
        i++;
    }
    if(!flag){
        System.out.println(num+"is a PRIME number");
    }
    else{
        System.out.println(num+"not a PRIME number");
    }
}
}