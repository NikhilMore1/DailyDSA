package EPAM.OOPS;

public class StaticBlock {
    static int a = 10;
    static int b;
    int c;
    static String print1(){
        return b+"";
    }
    public String print(){
        System.out.println("I am in non static method");
        return "Hello";
    }
    static {
        System.out.println("Hello i am now in static block");
        b = 101;
    }
    {
        c = 200;
        System.out.println("I am in non static block");
    }
    StaticBlock(){
        System.out.println("this is counstuctor");
    }

    public static void main(String[] args) {
        System.out.println("Hello main");
        StaticBlock ob = new StaticBlock();
        ob.print();
        System.out.println(print1());
    }
}
