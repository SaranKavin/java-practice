import java.util.Scanner;
class color{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
         String color=scan.nextLine();
        // String yellow=scan.nextLine();
        // String green=scan.nextLine();
        
        if(color.equals("red")){
            System.out.println("stop");
        }
      else if(color.equals("yellow")){
            System.out.println("wait");
        }
       else if(color.equals("green")){
            System.out.println("go");
        }
    }
}