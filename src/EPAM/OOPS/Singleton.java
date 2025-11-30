package EPAM.OOPS;

public class Singleton {
   private Singleton(){

    }
    int a = 10;

   private static Singleton singleton;

   public static Singleton getSingleton(){
       if (singleton == null){
           singleton = new Singleton();
           return singleton;
       }
       return singleton;
   }
}
