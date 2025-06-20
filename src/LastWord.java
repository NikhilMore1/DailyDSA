public class LastWord {
    public static void main(String[] args){
        String str = "fly to     moon";
        String [] str1 = str.split(" ");
        System.out.println(str1[str1.length-1].length());
    }
}
