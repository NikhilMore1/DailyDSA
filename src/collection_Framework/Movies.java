package collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Movies implements Comparable<Movies>{
    String name;
    int price;
    Movies(String name,int price){
        this.name = name;
        this.price = price;
    }
    @Override
    public int compareTo(Movies o) {
        if (this.price == o.price){
            return 0;
        } else if (this.price < o.price) {
            return -1;
        }else {
            return 1;
        }
    }

    @Override
    public String toString(){
        String data = "Movie name "+this.name+" price "+this.price;
        return data;
    }

    public static void main(String[] args) {
        ArrayList<Movies> movies = new ArrayList<>();
        Movies m1 = new Movies("chaava",1000);
        Movies m2 = new Movies("Sayaraa",200);
        Movies m3 = new Movies("Sairaat",500);
        movies.add(m1);
        movies.add(m2);
        movies.add(m3);
        Collections.sort(movies);
        System.out.println(movies);
    }
}
