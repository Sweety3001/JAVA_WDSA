import java.util.HashMap;

public class Q8 {
  public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int k = 2;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1); 

        int sum = 0;
        int count = 0;

        for (int num : arr) {
            sum += num;

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
  

  }
}
// 8->
// find the number of subarray whose sum is exactly k
// input=[1,1,1] k=2
// output=2