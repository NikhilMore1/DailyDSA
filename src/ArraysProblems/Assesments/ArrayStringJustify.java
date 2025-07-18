package ArraysProblems.Assesments;

public class ArrayStringJustify {
    public static void main(String[] args) {
        String[][] str = {{"Hello ","World "},{"How ","are ","you "}};
        int width = 16;
        String str1 = "";
        for (String[] ele1:str){
            for (String ele:ele1){
                str1 =str1+ ele;
            }
        }
        System.out.println(str1);
        String finalString = str1.trim();
        System.out.println(finalString.length());
        int index = 0;
        while (index<finalString.length()){
            int end  = Math.min(index+width , finalString.length());
            String line = finalString.substring(index,end);
            int pad = width - line.length();
            int leftPad = pad/2 + (pad%2);
            int rightPad = pad/2;
            String op = " ".repeat(leftPad)+line+" ".repeat(rightPad);
            System.out.println("\""+op+"\"");
            index = index+width;

        }
    }
}
