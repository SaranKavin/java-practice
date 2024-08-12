import java.util.Scanner;
class lone{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("you are Salary");
        int salary= scan.nextInt();
        System.out.println("you are Age");
        int age= scan.nextInt();
     
        if(salary>=20000 || age<=25){
            System.out.println("you are eligible");
            System.out.println("Enter lone Amount"); 
            int amount= scan.nextInt();

            if(amount<50000){
                 System.out.println("you are eligible"); 
            }   
            else{
                System.out.println("you are not eligible lone amount is 50000 only");   
            }
        }
        else{
            System.out.println("you are not eligible");
        }
       
    }
}