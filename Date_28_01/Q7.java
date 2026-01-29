
import java.util.HashMap;

public class Q7 {
  public static void main(String[] args) {
    int[] arr = {1, 2, 1, 2, 3};
    HashMap<Integer, Integer> map = new HashMap<>();
    int left = 0, maxLen = 0;

        for (int right = 0; right < arr.length; right++) {
            map.put(arr[right], map.getOrDefault(arr[right], 0) + 1);

            while (map.size() > 2) {
                map.put(arr[left], map.get(arr[left]) - 1);
                if (map.get(arr[left]) == 0) {
                    map.remove(arr[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        System.out.println(maxLen);
      }
  }
  

// 7->
// netwotk latency locks are given find the longest subarray with atmost 2 distinct value
// input=[1,2,1,2,3]; 
// ouput=4(length of subarray)
//in single function using hashmap