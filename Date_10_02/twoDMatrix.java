
public class twoDMatrix {
  static class Pair{
    int row;
    int col;
    Pair(int r,int c){
      this.row=r;
      this.col=c;
    }
  }
  static Pair binarySearch(int[][] arr, int target,int l, int r){
    while(l<r){
      int mid=(l+r)/2;
      int c=arr[mid].length-1;
      if(arr[mid][0]<=target && arr[mid][c]>=target){
        int p=0;
        int q=c;
        while(p<q){
          int middle=(p+q)/2;
          if(arr[mid][middle]==target)
            return new Pair(mid,middle);
          else if(arr[mid][middle]<target)
            p=middle+1;
          else 
            q=middle-1;
        }
        return new Pair(-1,-1);
      }
      else if(arr[mid][0]>target)
        return binarySearch(arr, target, 0, mid-1);
      else
        return binarySearch(arr, target, mid+1, r);
    }
    return new Pair(-1,-1);
  }
  public static void main(String[] args) {
    int[][] mat=new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
    int target =5;
    Pair res=binarySearch(mat,target,0,mat.length-1);
    System.out.println(res.row);
  }
}
