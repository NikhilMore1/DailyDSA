package ArraysProblems;

public class EvenOdd_hirarchy {
    public static void main(String[] args) {
        int[] arr = {12,1,2,3,4,5,6,7,8,9,4,5,7};
       int countEven = 0;
       int countOdd = 0;
       for (int i=0;i<arr.length;i++){
           if(arr[i]%2 == 0){
               countEven ++;
               continue;
           }
           countOdd++;
       }
       if (countEven>countOdd)
           System.out.println("Even count is more "+countEven);
        System.out.println("Odd count is more "+countOdd);
        for (int i=0;i<arr.length;i++){
            if(countEven>countOdd) {
                System.out.print(evenFun(arr[i])+ " ");
            }else {
                System.out.print(oddFun(arr[i])+" ");
            }
        }

    }

    public static int evenFun(int ele){
        int newEle = 0;
        if(ele%2 != 0){
            newEle = ele+1;
        }
        else
            newEle = ele;

        return  newEle;
    }
    public static int oddFun(int ele){
        int newEle = 0;
        if (ele%2 == 0)
            newEle = ele+1;
        else
            newEle = ele;
        return  newEle;
    }

}
