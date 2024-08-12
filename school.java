import java.util.Scanner;
public class school {
    String passorfail(int mark){
        
        if(mark > 35){
            return "pass";
        }
        else{
           return "fail";
        }
    }
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        
        int mark=scan.nextInt();
        
        school obj =new school();
        
        String result= obj.passorfail(mark);

        System.out.println(result);

    }
}


