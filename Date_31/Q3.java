
import java.util.HashMap;

public class Q3 {
  public static void main(String[] args) {
    int[] arr={0,1,0,1,0,0};
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(0, -1);
    int n=arr.length;
    int sum=0;
    int maxlen=0;
    for(int i=0;i<n;i++){
      sum+=(arr[i]==0)?-1:1;
      if(map.containsKey(sum)){
        maxlen=Math.max(maxlen, i-map.get(sum));
      }else{
        map.put(sum, i);
      }
    }
    System.out.println(maxlen);
  }
}
//arr=[0,1,0,1,1,0]
// find the longest stretch with 0s and 1s with equal 0s and 1s
// output=length of subarray and subarray