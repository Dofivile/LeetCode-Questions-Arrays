class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
           int i=0;
        while(i<nums.length){
            if(nums[i]!=i+1 && nums[i]!=nums[nums[i]-1]){
                int temp;
                temp=nums[i];
                nums[i]=nums[temp-1];
                nums[temp-1]=temp;
            }else{
                ++i;
                
            }
        }
        ArrayList <Integer> count=new ArrayList<Integer>();
        for(int j=0;j<nums.length;++j){
            if(nums[j]!=j+1){
                count.add(j+1);
            }
        }
        return count;
    }

}
