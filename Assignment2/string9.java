package Assignment2;
//S.Venkata Ashrith
//division 22(b)
//210303125081

public class string9 {
    //StringGetBytesExample
    public static void main(String args[]){
        String s1="ABCDEFG";
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
    }
}
