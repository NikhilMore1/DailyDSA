package ArraysProblems.Assesments.StudentApplication;

import java.util.Scanner;

public class StudentDriver {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ans;

        do {
            System.out.println("Welcome Student Management using JAVA");
            System.out.println("Please enter following op");
            System.out.println("1. Add the Student");
            System.out.println("2. View Student Data");
            int ch = sc.nextInt();
            switch (ch){
                case 1:{
                    addStudent();
                    break;
                }
                case 2:{
                    viewData();
                    break;
                }
                default:{
                    System.out.println("Enter the valid input ");
                    break;
                }
            }
            System.out.println("Do you want to continue");
            ans = sc.next().charAt(0);

        }while (ans == 'Y'||ans == 'y');

    }
    public static void addStudent(){
        Student st = new Student();
        st.studentInfo();
    }
    public static void viewData(){
        System.out.println("hey");
    }
}
