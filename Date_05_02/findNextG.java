//method 1
// import java.util.*;

// public class findNextG {

//   public static void main(String[] args) {

//     int[] arr = {4, 5, 2, 10};
//     int n = arr.length;
//     int[] res = new int[n];
//     Stack<Integer> stk = new Stack<>();
//     for (int i = n - 1; i >= 0; i--) {
//       // remove smaller elements
//       while (!stk.isEmpty() && stk.peek() <= arr[i]) {
//         stk.pop();
//       }      
//       // answer
//       if (stk.isEmpty()) {
//         res[i] = -1;
//       } else {
//         res[i] = stk.peek();
//       }
//       //push current element
//       stk.push(arr[i]);     
//     }
//     System.out.println(Arrays.toString(res));     
//   }
// }

// find next greater element of each element in a array
// input=[4,5,2,10]
// output=[5,10,10,-1]


//method 2
import java.util.*;
public class findNextG{
  static int[] netmax(int[] arr){
    int n=arr.length;
    int[] res=new int[n];
    Stack<Integer> st=new Stack<>();
    for(int i=n-1;i>=0;i--){
      while(!st.isEmpty()&& st.peek()<=arr[i]){
        st.pop();
      }
      if(st.isEmpty()){
        res[i]=-1;

      }else{
        res[i]=st.peek();
      }
      st.push(arr[i]);
      
    }
    return res;
  }
  
  static int[] prevmin(int[] arr){
    int n=arr.length;
    int[] res=new int[n];
    Stack<Integer> st=new Stack<>();
    for(int i=0;i<n;i++){
      while(!st.isEmpty()&& st.peek()>=arr[i]){
        st.pop();
      }
      if(st.isEmpty()){
        res[i]=-1;

      }else{
        res[i]=st.peek();
      }
      st.push(arr[i]);
      
    }
    return res;
  }
  
  public static void main(String[] args) {
    int[] arr={4,5,2,10};
    // int[] res=netmax(arr);
    int[] res=prevmin(arr);
    for(int i=0;i<arr.length;i++){
      System.out.println(res[i]+" ");
    }
  }
}