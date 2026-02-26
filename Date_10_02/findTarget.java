public class findTarget {
  static int binarySearch(int[] arr,int target,int l,int r){
    if(l<=r){
      int mid=(l+r)/2;
      if(arr[mid]==target) return mid;
      if(arr[l] <= arr[mid]){
        if(target>=arr[l] && target<arr[mid])
          return binarySearch(arr, target, l, mid-1);
        else
          return binarySearch(arr, target, mid+1, r);
      }else{
        if(target>arr[mid] && target <= arr[r]){
          return binarySearch(arr, target, mid+1, r);
        
        }else{
          return binarySearch(arr, target, l, mid-1);
        }
      }
    }
    return -1;
  }
  public static void main(String[] args) {
    int[] arr={6,7,1,2,3,4,5};
    int idx=binarySearch(arr, 3,0,arr.length-1);
    System.out.println("Index: "+idx);
  }
}
