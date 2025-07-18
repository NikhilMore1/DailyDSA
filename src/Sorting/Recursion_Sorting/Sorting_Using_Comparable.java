package Sorting.Recursion_Sorting;

import java.util.Arrays;

public class Sorting_Using_Comparable implements Comparable<Sorting_Using_Comparable>{
    public int empId;
    public String name;
    public int sal;
    public String dept;

    Sorting_Using_Comparable(int empId,String name,int sal,String dept){
        this.empId = empId;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }

    @Override
    public String toString(){
        return "Employee Details [ emp Id : "+empId+" ename : "+name +" dpart : "+dept+" salary : "+sal +"] ";
    }

//    @Override
//    public int compareTo(Sorting_Using_Comparable o) {
//        return this.empId - o.empId;
//    }
//
//    @Override
//    public int compareTo(Sorting_Using_Comparable o1){
//        return this.name.compareTo(o1.name);
//    }
    @Override
    public int compareTo(Sorting_Using_Comparable o2){
        return this.dept.compareTo(o2.dept);
    }

    public static void main(String[] args) {
        Sorting_Using_Comparable[] emp = new Sorting_Using_Comparable[3];
        emp[0] = new Sorting_Using_Comparable(12,"Suresh",2002,"Tester");
        emp[1] = new Sorting_Using_Comparable(11,"Mahesh",2001,"SDE");
        emp[2] = new Sorting_Using_Comparable(122,"Ramesh",20022,"Manager");
        for (Sorting_Using_Comparable em : emp){
            System.out.println(em);
        }

        Arrays.sort(emp);
        System.out.println("-------------------------------------------");

        for (Sorting_Using_Comparable ee:emp){
            System.out.println(ee);
        }

    }
}
