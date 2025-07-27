import java.util.ArrayList;
import java.util.List;

class Main {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> a = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i];
            if (correct < nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j) {
               a.add(j);
            }
        }
        return a;
    }

    public void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
