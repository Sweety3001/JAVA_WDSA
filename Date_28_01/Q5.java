public class Q5 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int k = 2;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int minSum = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i]; 
            minSum = Math.min(minSum, sum);
        }

        System.out.println("Min sum: " + minSum);
    }
}


// 5->
// a factory tracks energy usage per hour find the minimun sum of any k continous hour