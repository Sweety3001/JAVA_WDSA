
import java.util.HashMap;

public class Q4 {
  public static void main(String[] args) {
    int[] arr={7,4,2,6,1,10};
    HashMap<Integer,Integer>map=new HashMap<>();
    int n=arr.length;
    map.put(0,1);
    int prefix=0;
    int count=0;
    int k=2;
    for(int x:arr){
      prefix=prefix+x;
      int rem=prefix%k;
      if(map.containsKey(rem)){
        count=count+map.get(rem);
      }
      map.put(rem,map.getOrDefault(rem, 0)+1);
    }
    System.out.println(count);
  }
}
// wap to count subarrays whose sum is divisible by k, find the count of subarray
// arr={7,4,2,6,1,10}, k=2