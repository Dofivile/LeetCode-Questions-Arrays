class Solution {
    public int[] sortArrayByParity(int[] nums) {
            int temp;
            int i=0;
            int j=0;
        while(i < nums.length&& j < nums.length ){
            
            if(nums[i]%2==1 && nums[j]%2==1){
                j++;
            }else if(nums[i]%2==1 && nums[j]%2==0){
                 temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                j++;
                i++;
            }else{
                i++;
                j++;
            }
        }
   return nums;
    }
}
