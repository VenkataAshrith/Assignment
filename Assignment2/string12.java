package Assignment2;
//S.Venkata Ashrith
//division 22(b)
//210303125081
public class string12 {
    //InternExample
    public static void main(String args[]){
        String s1=new String("java");
        String s2="java";
        String s3=s1.intern();
        System.out.println(s1==s2);
        System.out.println(s2==s3);
    }
}
