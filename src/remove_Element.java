public class remove_Element {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,2,2,2,1};
        int val = 3;
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        System.out.println(count);
    }
}
