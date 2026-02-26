public class prefixSumPsuffixSUm {
  public static void main(String[] args) {
    int[] arr={1,2,3,4,3};
    int totalS=0;
    for(int x:arr){
      totalS+=x;
    }
    boolean found=false;
    for(int i=1;i<arr.length;i++){
      arr[i]=arr[i-1]+arr[i];
      if(arr[i]==(totalS-arr[i])){
        found=true;
        break;
      }
    }
    System.out.println(found);
  }
}
//check that prefix sum of a part of the array is equal to the suffix sum of rest of the array

//LOGIC
/*
find total sum
prefix sum + suffix sum=total sum
suffix sum=total-prefix
each step find prefix and compare with suffix
*/