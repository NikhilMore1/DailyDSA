package EPAM.OOPS;

public class Main {
    String name;
    int age;
    String add;
    static int population = 0;

    Main(String name,String add,int age){
        this.name = name;
        this.add  = add;
        this.age = age;
        population++;
    }

    @Override
    public String toString(){
        return "Name "+name+" address" +add+" age"+age;
    }
    public String getCount(){
        if (population>3){
            return "No more object are allowed"+population;
        }
        return "new obj created obj count -> "+population;
    }
    public static void main(String[] args) {
        Main obj = new Main("Kunal","pune",21);
        Main ob1 = new Main("Nikhil","Mumbai",21);
        Main obj2 = new Main("Kunal","pune",21);
        Main ob13 = new Main("Nikhil","Mumbai",21);
        System.out.println(ob1);
        System.out.println(obj);
        System.out.println(obj.getCount());
        System.out.println(obj2);
        System.out.println(ob13);
        System.out.println(obj.getCount());

    }
}
