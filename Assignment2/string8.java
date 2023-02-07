package Assignment2;
//S.Venkata Ashrith
//division 22(b)
//210303125081
public class string8 {
    // FormatExample
    public static void main(String args[]){
        String name="ashrith";
        String sf1=String.format("name is %s",name);
        String sf2=String.format("value is %f",32.33434);
        String sf3=String.format("value is %32.12f",32.33434);//returns 12 char fractional part filling with 0

        System.out.println(sf1);
        System.out.println(sf2);
        System.out.println(sf3);
    }
}
