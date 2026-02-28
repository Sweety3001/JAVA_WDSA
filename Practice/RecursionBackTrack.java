public class RecursionBackTrack {
  static void printBackTrack(int i,int n){
    if(i<1) return;
    printBackTrack(i-1, n);
    System.out.println(i);
  }
  static void printBackTrackR(int i,int n){
    if(i>n) return;
    printBackTrackR(i+1, n);
    System.out.println(i);
  }
  public static void main(String[] args) {
    int n=6;
    // printBackTrack(n,n);
    printBackTrackR(1,n);
  }
}
