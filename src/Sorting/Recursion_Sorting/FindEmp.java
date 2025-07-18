package Sorting.Recursion_Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FindEmp {
    private int idx;
    private String name;
    private String dept;
    private int sal;

    public FindEmp(int idx, String name, String dept, int sal) {
        this.idx = idx;
        this.name = name;
        this.dept = dept;
        this.sal = sal;
    }
    @Override
    public String toString(){
        return "Emp Details ["+idx+" Name "+name+" dept "+dept+" salary "+sal+" ]";
    }

    public static FindEmp disp(FindEmp[] obj,int id){
        for (int i = 0;i<obj.length;i++){
            if (obj[i].idx == id){
                return obj[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FindEmp[] arr = new FindEmp[5];
        arr[0] = new FindEmp(123,"Sahil","Tester",25000);
        arr[1] = new FindEmp(124,"Ramesh","SDE1",35000);
        arr[2] = new FindEmp(125,"Suresh","SDE2",45000);
        arr[3] = new FindEmp(121,"Mahesh","Manager",50000);
        arr[4] = new FindEmp(127,"Prathamesh","Head",100000);
        System.out.println("Enter id ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
//        Arrays.sort(arr);
//        for (FindEmp emp : arr){
//            System.out.println(emp);
//        }

        if (disp(arr,id)!=null){
            System.out.println(disp(arr,id));
        }else {
            System.out.println(-1);
        }
    }

}
