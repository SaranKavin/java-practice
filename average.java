import java.util.*;
class average{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("mark1");
        int mark1= scan.nextInt();
        int mark2= scan.nextInt();
        int mark3= scan.nextInt();
        int mark4= scan.nextInt();
        int mark5= scan.nextInt();
        int total=mark1+mark2+mark3+mark4+mark5;
        int avg=total/5;
        System.out.println("Total "+total);
        System.out.println("Avg "+avg);
        if(avg<35){
            System.out.println("You need additional class");
        }
        else{
            System.out.println("You are good to go");
        }


    }
}