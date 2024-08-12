public class parameters {

    void getsopa(int money){

        System.out.println(money);
        System.out.println("Soap");
    }

    void getchoco(int money){
        
        System.out.println(money);
        System.out.println("chocolate");
    }


    public static void main(String[] args) {
        parameters obj=new parameters();
        obj.getsopa(20);
        obj.getchoco(10);
        
    }
}
