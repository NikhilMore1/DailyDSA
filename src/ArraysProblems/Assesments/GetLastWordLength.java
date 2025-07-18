package ArraysProblems.Assesments;

public class GetLastWordLength {
    public static int getLength(){
        String str = "This is Java Language";
        String[] newStr = str.split(" ");
        for (String s: newStr){
            System.out.println(s);
        }

        return newStr[newStr.length-1].length();

    }

    public static void main(String[] args) {
        System.out.println(getLength());
    }
}
