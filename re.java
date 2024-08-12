public class re {

    int a=10;
    int b=5;

    int sum(){

        int c= a+b;
        
        return c;
    }

    public static void main(String[] args) {
        
        re obj = new re();
        
        int ret_value = obj.sum();
        
        System.out.print(ret_value);

    }
    
}
