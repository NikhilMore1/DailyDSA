public class LastWord {
    public static int getLen(String str){
        String[] lastStr = str.split(" ");
        String st1 = lastStr[lastStr.length-1];
        return  st1.length();
    }

    public static void main(String[] args) {
        String str = "Hello Java";
        System.out.println(getLen(str));
    }
}