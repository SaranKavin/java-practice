import java.util.Scanner;
class forloop1{
    public static void main(String args[])
    {
       Scanner scan=new Scanner(System.in);
       int a = scan.nextInt();
       int b = scan.nextInt();
       int count=0;
       for (int i=a; i<=b; i=i+1){
        if(i%3==0 && i%5==0)
       
         count=count+1;
      
        }
        System.out.println(count);
    }
    
}