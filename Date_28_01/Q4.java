public class Q4 {
  public static void main(String[] args) {
      int[] arr={1,4,20,3,10,5};
      int s=33;
      int n=arr.length;
      int l=0,sum=0;
      boolean flag=false;
      for(int i=0;i<n;i++){
        sum=sum+arr[i];
        while(sum>s){
          sum=sum-arr[l];
          l++;
        }
        if(sum==s){
          System.out.println("Subarray found: "+l+" to "+(i));
          flag=true;
        }
      }
      if(!flag){
        System.out.println("Subarray not found");
      }
  }
}
// 4->
// a finance app records daily profit and check if there exist a continous period whose sum equals target s
// input=[1,4,20,3,10,5]; s=33
// output=20,3,10