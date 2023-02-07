package Assignment2;
//S.Venkata Ashrith
//division 22(b)
//210303125081
public class string7 {
    //EqualsIgnoreCaseExample{
    public static void main(String args[]){
        String s1="ashrith";
        String s2="ashrith";
        String s3="ASHRITH";
        String s4="java";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}
