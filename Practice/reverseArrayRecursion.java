public class reverseArrayRecursion {
  static void swap(int i,int n, int[] arr){
    if(i>=n) return;
    int temp=arr[i];
    arr[i]=arr[n];
    arr[n]=temp;
    swap(i+1,n-1,arr);
  }
  public static void main(String[] args) {
    int[] arr={2,3,4,5,6};
    int n=arr.length;
    swap(0,n-1,arr);
    for(int x:arr){
      System.out.print(x+" ");
    }
  }
}
