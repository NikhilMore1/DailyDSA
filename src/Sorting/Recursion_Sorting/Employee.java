package Sorting.Recursion_Sorting;

import java.util.Arrays;

public class Employee {
    public int empId;
    public String name;
    public int sal;
    public String dept;
    Employee(Employee e){
        this.empId = e.empId;;
        this.name = e.name;
        this.sal = e.sal;
        this.dept = e.dept;
    }
    Employee(int empId,String name,int sal,String dept){
        this.empId = empId;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }
    public static void sortEmp(Employee[] em){
        for (int i =0;i<em.length;i++){
            Employee key = new Employee(em[i]);
            int j = i-1;
            while (j>=0 && em[j].dept.compareTo(key.dept)>0){
                em[j+1] = new Employee(em[j]);
                j--;
            }
            em[j+1] =key;
        }
    }

    public static void main(String[] args) {
        Employee[] obj = new Employee[5];
        obj[0] = new Employee(123,"ABC",100,"Tester");
        obj[1] = new Employee(1232,"pqr",200,"Software");
        obj[2] = new Employee(111,"qqq",300,"Account");
        obj[3] = new Employee(333,"kkk",400,"Sales");
        obj[4] = new Employee(555,"ppp",6000,"Manager");

        sortEmp(obj);
        for (Employee e:obj){
//            System.out.println(Arrays.toString(e));
        }
    }
}
