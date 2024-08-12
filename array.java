import java.util.Scanner;
class array{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int[] num=new int[5];

        for (int i=0;i<5;i=i+1){
            num[i]=scan.nextInt();
        }
        for(int i=0;i<5;i=i+1)
            System.out.println("mark"+num[i]);

    }
}
































// import java.util.Scanner;
// public class array {
//     public static void main(String[] args) {
//         int[] num=new int[5];
//         Scanner scan=new Scanner(System.in);
//         num[0]=scan.nextInt();
//         num[1]=scan.nextInt();
//         num[2]=scan.nextInt();
//         num[3]=scan.nextInt();
//         num[4]=scan.nextInt();
//         System.out.println(num[0]+num[1]+num[2]+num[3]+num[4]);

        
//     }
// }
