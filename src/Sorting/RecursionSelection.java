package Sorting;

public class RecursionSelection {
    public static void selection(int indx){
        int[] arr = {7,6,4,3,2,1};
        methodI(0,arr);


    }
    public static int methodI(int i,int[] arr){
        if(i>arr.length-1){
            return 0;
        }
        return methodI(++i,arr);
    }
    public static int method(int j,int[] arr)
    {
        int min = methodI(0,arr);
        if (j>arr.length-1){
            return  -1;
        }
        return method(methodI(0,arr)+1,arr);
    }

    

    public static void main(String[] args) {
        int[] arr = {7,6,5,3,2,1};

    }
}
