package Amazon.Arrays;

public class VowelAndCons {
    public static void main(String[] args){
        String str = "Hello Nikhil";
        get(str);
    }
    public static void get(String str){
        int cons  = 0;
        int vovel = 0;
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' ||str.charAt(i) == 'O'|| str.charAt(i) == 'U'||str.charAt(i) == 'a'||str.charAt(i) == 'e'||str.charAt(i) == 'i'||str.charAt(i) == 'o'||str.charAt(i) == 'u'){
                vovel++;
            }else{
                cons++;
            }
        }
        System.out.println(vovel);
        System.out.println(cons);
    }
}
