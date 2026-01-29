import java.util.ArrayList;
public class Q1 {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3};
        ArrayList<Integer> arr2 = new ArrayList<>();
        for (int x : arr) {
            if (!arr2.contains(x)) {
                arr2.add(x);
            }
        }
        for (int x : arr2) {
            System.out.print(x);
        }
    }
}
//remove duplicate elements from sorted array
// input=[1,1,2,2,3]
// output=[1,2,3]
