public class Q6 {
  public static void main(String[] args) {
    int[] arr = {2, 3, 1, 2, 4, 3};
    int target = 7;
    System.out.println(minSubArrayLen(target, arr));
  }

  public static int minSubArrayLen(int target, int[] arr) {
    int minLength = Integer.MAX_VALUE;
    int sum = 0;
    int left = 0;

    for (int right = 0; right < arr.length; right++) {
      sum += arr[right];
      while (sum >= target) {
        minLength = Math.min(minLength, right - left + 1);
        sum -= arr[left];
        left++;
      }
    }

    return minLength == Integer.MAX_VALUE ? 0 : minLength;
  }
}
  // 6->
// you have power rating find the smallest subarray whose sum is greater than equal to target 
// input=[2,3,1,2,4,3]; target=7
// output=2(length of subarray)