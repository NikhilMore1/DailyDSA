package OOPs.Intro;

public class Incapsulation {
    private String name;
    private int pin;
    private int pass;
//    Incapsulation(String name,int pin,int pass){
//        this.name = name;
//        this.pin = pin;
//        this.pass = pass;
//    }
    public String getName(){
        return name;
    }
    public int getPin(){
        return pin;
    }
    public int getPass(){
        return pass;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPin(int pin){
        this.pin = pin;
    }
    public void setPass(int pass){
        this.pass = pass;
    }
    public static void main(String[] args){
        Incapsulation obj = new Incapsulation();
        obj.setName("nikhil");
        obj.setPass(10222);
        obj.setPin(0010);
        System.out.println(obj.getName());
        System.out.println(obj.getPass());
        System.out.println(obj.getPin());
    }
}
