
public class Q3 {

    public static void main(String[] args) {
        int[] arr = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int l = 0;
        int n = arr.length - 1;
        int maxArea = 0;
        while (l < n) {
            int height = Math.min(arr[l], arr[n]);
            int weidth = n - l;
            int area = height * weidth;
            if (area > maxArea) {
                maxArea = area;
            }
            if (arr[l] < arr[n]) {
                l++;
            } else {
                n--;
            }
        }
        System.out.println(maxArea);
    }
}
//leetcode q11
