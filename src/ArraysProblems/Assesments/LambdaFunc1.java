package ArraysProblems.Assesments;
@FunctionalInterface
interface Say{
    void say1();
}
public class LambdaFunc1 {

    public static void main(String[] args) {
        Say s = () ->
                System.out.println("Hello lambda ");
        s.say1();
    }
}
