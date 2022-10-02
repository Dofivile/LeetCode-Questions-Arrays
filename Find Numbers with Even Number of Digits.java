class Solution {
    public int findNumbers(int[] nums) {
           int count=0;
           int counteven=0;
      for(int number:nums){
        while(number>=1){
            number=number/10;
            count++;
            }
        if(count%2==0){
            counteven++;
        }
        count=0;
        }
        
     return counteven;
    }
     
}
