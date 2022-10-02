class Solution {
    public boolean validMountainArray(int[] arr) {
               if(arr.length<3)
                 return false;
               int count=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1]){
                count=i;   
                break;
            }
            
        }
          if(count==0){
                return false;
            }
      
         for(int i=count;i<arr.length-1;i++){
             if(arr[i]<=arr[i+1]){
                return false;
        }
    }
        
        return true;
    }
}
    
    
