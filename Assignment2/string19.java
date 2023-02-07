package Assignment2;
//S.Venkata Ashrith
//division 22(b)
//210303125081
public class string19 {
    // SplitExample{
    public static void main(String args[]){
        String s1="string split method in java";
        String[] words=s1.split("\\s");

        for(String w:words){
            System.out.println(w);
        }
    }
}
