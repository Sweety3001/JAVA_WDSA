public class MinMoves {
    static int minMoves(int[] arr) {
        int moves = 0;
        while (!allEqual(arr)) {
            int max = arr[0];
            int maxIndex = 0;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                    maxIndex = i; 
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (i != maxIndex) {
                    arr[i]++;   
                }
            }
            moves++;
        }
        return moves;
    }
    static boolean allEqual(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[0]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 6, 3};
        int moves = minMoves(arr);
        System.out.println("Total moves = " + moves);
    }
}




// public class Q1 {
//   public static void main(String[] args) {
//     int[] arr={3,4,6,6,3};
//     int move=0;
//     int min=arr[0];
//     for(int x:arr){
//       if(x<min) {
//         min=x;
//       }
//     }
//     for(int x:arr){
//       move+=(x-min);
//     }
//     System.out.println(move);
//   }
// }
// 1->
// array of Number={3,4,6,6,3}
// calculate min no. of moves
// you can iterate on all but you can only fix one element
// rest of the element must increment by one

// ex={3,4,6,6,3}
// 1st 
// 4,5,7,6,4
// 2nd 
// 5,6,7,7,5
// 3rd
// 6,7,8,7,6
// 4th
// 7,8,8,8,7
// 5th
// 8,9,8,9,8
// 6th
// 9,10,9,9,9
// 7th
// 10,10,10,10,10