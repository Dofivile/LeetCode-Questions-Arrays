class Solution {
    public void duplicateZeros(int[] arr) {
            int count=0;
            for(int i=0;i<arr.length;++i){
                   if(arr[i]==0){
                      count++;
                   }
             }
           int j=0;
           int item[]=new int[arr.length+count];
           for(int i=0;i<arr.length;++i){
                  if(arr[i]==0){
                     item[j++]=arr[i];
                     item[j++]=arr[i];
                  }else{
                     item[j]=arr[i];
                     ++j;
                  }
           }
         for (int i=0;i< arr.length;++i){
                arr[i]=item[i];
            }
         }
    }
