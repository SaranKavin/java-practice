import java.util.Scanner;
class score{
    public static void main (String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Score");
        int score =scan.nextInt();
        if(score<50){
            System.out.println("you need to improve");
        }
        if(score<=70 && score>50){
            System.out.println("Good Job");
        }
        if( score>70 && score<=100){
            System.out.println("Excellent Perfomance");
        }
    }

       
}
