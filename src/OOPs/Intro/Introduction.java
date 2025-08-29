package OOPs.Intro;

import java.util.Arrays;

public class Introduction {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Student nikhil = new Student(101,99.0f);

        //At runtime if memory is allocated for an instances then it is dynamic memory allocation
        //after new keyword whatever we write if check at runtime and left side check in compile time


        System.out.println(Arrays.toString(students));
        System.out.println(nikhil.roll);
        students[0] = nikhil;
        System.out.println(Arrays.toString(students));
    }
}
class Student{
    int roll;
    float marks;
    Student(int roll,float marks){
        this.roll = roll;
        this.marks = marks;
    }

    @Override
    public String toString(){
        return "{ roll no :"+roll+", marks :"+marks+" }";
    }
}
