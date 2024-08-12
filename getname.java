public class getname {

    String myname(){
        String name="Saran";
        return name;
    }

    long phnum(){
        long num=123456789;
        return num;
    }
     
    String address(){

        String Add="khgdk kgfh kdhgf jfjd ";
        return Add;
    }
    public static void main(String[] args) {

        getname obj = new getname();

        String ret_name=obj.myname();

        System.out.println(ret_name);

        getname obj2=new getname();

        long contact=obj2.phnum();

        System.out.println(contact);

        getname address =new getname();

        String myadd=  obj.address();
        System.out.println(myadd);

    }
}
