import java.util.HashMap;
public class Q1 {
  public static void main(String[] args) {
    int[] arr={1,-1,3,-3,4};
    int n=arr.length;
    int prefix=0;
    int maxlen=0;
    HashMap<Integer,Integer>map=new HashMap<>();
    map.put(0, -1);
    for (int i=0;i<n;i++) {
        prefix+=arr[i];
        if(map.containsKey(prefix)){
          int prev=map.get(prefix);
          int len=i-prev;
          maxlen=Math.max(maxlen, len);
        }else{
          map.put(prefix, i);
        }
    }
    System.out.println("length: "+maxlen);
  }
}
