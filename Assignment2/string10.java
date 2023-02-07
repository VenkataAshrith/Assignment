package Assignment2;
//S.Venkata Ashrith
//division 22(b)
//210303125081

public class string10 {
    //StringGetCharsExample
    public static void main(String args[]){
        String str = new String("hello ashrith how are you");
        char[] ch = new char[10];
        try{
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}
    }
}
