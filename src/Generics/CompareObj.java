package Generics;

public class CompareObj implements Comparable<CompareObj>{
    int marks;
    String name;
    CompareObj(int marks,String name){
        this.marks = marks;
        this.name = name;
    }


    @Override
    public int compareTo(CompareObj o) {
        return (int)(this.marks - o.marks);
    }

    public static void main(String[] args) {
        CompareObj n1 = new CompareObj(10,"Yash");
        CompareObj n2 = new CompareObj(30,"Nikhil");
        if (n1.compareTo(n2)<0){
            System.out.println("Ysh have more maks than nikhil");
        }

    }
}
