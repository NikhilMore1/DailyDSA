package Sorting;

public class MarkerEx_Selection {
    private String brand;
    private  String type;
    private int price;
    private String color;
    MarkerEx_Selection(String brand, String type, int price, String color){
        this.brand = brand;
        this.type = type;
        this.price = price;
        this.color  = color;
    }
    MarkerEx_Selection(MarkerEx_Selection obj){
        this.brand = obj.brand;
        this.type = obj.type;
        this.price = obj.price;
        this.color = obj.color;
    }

    public  String getBrand(){
        return  brand;
    }
    public String getType(){
        return  type;
    }
    public  int getPrice(){
        return  price;
    }
    public  String getColor(){
        return  color;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setColor(String color){
        this.color = color;
    }

    public void display(){
        System.out.println("Brand "+getBrand());
        System.out.println("Type :"+getType());
        System.out.println("Price "+getPrice());
        System.out.println("Color "+getColor());
    }
    public static void  sortByColor(MarkerEx_Selection[] obj){
        for (int i = 1;i<obj.length;i++){
            int j = i-1;
            MarkerEx_Selection key = new MarkerEx_Selection(obj[i]);
            while (j>=0 && obj[j].getColor().compareTo(key.getColor())>0){
                obj[j+1] = new MarkerEx_Selection(obj[j]);
                j--;
            }
            obj[j+1] = key;
        }
    }

    public static void main(String[] args) {
        MarkerEx_Selection[] obj = new MarkerEx_Selection[5];
        obj[0] = new MarkerEx_Selection("Camlin","Pen",120,"Blue");
        obj[1] = new MarkerEx_Selection("Classmate", "Pen", 200, "Red");
        obj[2] = new MarkerEx_Selection("Fountain","Pen",100,"Orenge");
        obj[3] = new MarkerEx_Selection("Camlin","Pen",200,"Green");
        obj[4] = new MarkerEx_Selection("Fountain","Pen",202,"Black");

        for (MarkerEx_Selection m1 : obj){
            m1.display();
        }
        System.out.println();
        sortByColor(obj);

        for (MarkerEx_Selection m :obj){
            m.display();
        }
    }
}
