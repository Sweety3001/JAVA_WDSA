public class segregate0and1 {
  public static void main(String[] args) {
      int[] arr={0,1,0,0,1,0,1,1};
        // code here
      int n=arr.length;
      //   int count=0;
      //   for(int x:arr){
      //       if(x==0){
      //           count++;
      //       }
      //   }
      //   for(int i=0;i<count;i++){
      //       arr[i]=0;
      //   }
      //   for(int i=count;i<n;i++){
      //       arr[i]=1;
      //   }
      //  for(int x:arr){
      //   System.out.print(x+" ");
      //  }
      int left=0;
      int right=n-1;
      while(left<right){
        if(arr[left]==1 && arr[right]==0){
          arr[left++]=0;
          arr[right--]=1;
        }
        if(arr[left]==0){
          left++;
        }
        if(arr[right]==1){
          right--;
        }
      }
      for(int x:arr){
        System.out.print(x+" ");
      }
    
  }
}
//count the number of 0s and update the array
//two pinter approach
/*
start 2 pointers from both side and if a 0 zero is present in right side take it to left side and 1 to right side.
*/