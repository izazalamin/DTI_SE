package day6;

public class ArrayDuplicate {
    public boolean containsDuplicate(int[] nums) {
        int i,j;
        for (i=0;i<nums.length;i++){
            for (j=i+1;j<nums.length;j++){
                if (nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
