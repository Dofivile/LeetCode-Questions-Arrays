class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        mergeSort(nums);
       
        return nums;
      }
      
        public static void mergeSort(int a[]){
        int length=a.length;
        if(length<2){
            return;
        }
        int mid=length/2;
        int left[]=new int[mid];
        int right[]=new int[length-mid];
        for(int i=0;i<mid;i++){
            left[i]=a[i];
        }
        for(int i=mid;i<length;i++){
            right[i-mid]=a[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(a,left,right);

    }
    
    public static void merge(int a[],int left[], int right[]){
        int i=0;
        int j=0;
        int k=0;
        while(i<left.length&& j<right.length){
            if(left[i]<right[j]){
               a[k++]=left[i++];
            }else{
               a[k++]= right[j++];
            }
        }
        while(i<left.length){
            a[k++]=left[i++];
       }
        while(j<right.length){
            a[k++]=right[j++];
        }
    }
}
