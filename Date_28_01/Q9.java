public class Q9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 10};
        int x = 8;

        int left = 0;
        int right = arr.length - 1;
        boolean found = false;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == x) {
                found = true;
                break;
            } else if (sum < x) {
                left++;      // increase sum
            } else {
                right--;     // decrease sum
            }
        }

        System.out.println(found);
    }


}
// 9->given a sorted array check if two number sum to x
// input=[1,2,4,6,10] x=8
// output=true