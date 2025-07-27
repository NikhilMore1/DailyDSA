package Generics;

public class Box<T extends String>{
    private T item;
    private T values ;
   public void setItem(T item){
       this.item = item;
   }
   public void setValues(T values){
       this.values = values;
   }
    public T getItem(){
        return item;
    }
    public T getValues(){
        return values;
    }
}
