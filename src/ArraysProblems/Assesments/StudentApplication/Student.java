package ArraysProblems.Assesments.StudentApplication;

import java.util.Scanner;

public class Student {
    private int id = 123;
    private String uID ;
    private String name;
    private long mobile;
    private Address address;
    private Education education;
    private Mocks mocks;

    Student(){
        super();
    }

    Student(String name, long mobile, Address address, Education education, Mocks mocks){
        this.name = name;
        this.mobile = mobile;
        this.address = address;
        this.education = education;
        this.mocks = mocks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    {
        uID = "Student@ "+id;
    }

    public int getId() {
        return id;
    }

    public String getuID() {
        return uID;
    }

    public String getName() {
        return name;
    }

    public long getMobile() {
        return mobile;
    }

    public Address getAddress() {
        return address;
    }

    public Education getEducation() {
        return education;
    }

    public Mocks getMocks() {
        return mocks;
    }
    Education[] educations = new Education[5];
    public static void studentInfo(){

        System.out.println("Welcome to Student Registration ");
        Student student = new Student();

        System.out.println("Enter the Student name");
        student.setName(new Scanner(System.in).next());
        System.out.println("Enter the mobile no");
        student.setMobile(new Scanner(System.in).nextLong());

        System.out.println("STUDENT ADDRESS INFORMATION ****");
        System.out.println("Enter your city name");
        student.address.setCity(new Scanner(System.in).next());
        System.out.println("Enter the state");
        student.address.setState(new Scanner(System.in).next());
        System.out.println("Enter the pincode");
        student.address.setPincode(new Scanner(System.in).next());

        Education[] edu = new Education[5];
        System.out.println("STUDENT EDUCATION *****");
        String op;
        for (int i=0;i<edu.length;i++){
            System.out.println("Enter your course");
            student.education.setCourse(new Scanner(System.in).next());
            System.out.println("Enter your branch");
            student.education.setBranch(new Scanner(System.in).next());
            System.out.println("Enter your earned cgpa");
            student.education.setCgpa(new Scanner(System.in).nextDouble());
            System.out.println("Enter your yop");
            student.education.setYop(new Scanner(System.in).next());

            System.out.println("You want to add one more");
            op = new Scanner(System.in).next();
            if(op.equalsIgnoreCase("NO"))
                break;
        }
    }
}
