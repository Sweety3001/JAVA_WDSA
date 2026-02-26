
import java.util.ArrayList;
import java.util.Arrays;

public class leetcpde57 {
  public static int[][] insert(int[][] intervals, int[] newInterval){
    ArrayList<int[]> res=new ArrayList<>();
    int n=intervals.length;
    for(int i=0;i<n;i++){
      if(intervals[i][1]<newInterval[0]){
        res.add(intervals[i]);
      }
    }
    for(int i=0;i<n;i++){
      if(intervals[i][0]<=newInterval[1]){
        newInterval[0]=Math.min(newInterval[0],intervals[i][0]);
        newInterval[1]=Math.min(newInterval[1],intervals[i][1]);
      }
      res.add(newInterval);
    }
    for(int i=0;i<n;i++){
      res.add(intervals[i]);
    }
    return res.toArray(new int[res.size()][]);
  }
  public static void main(String[] args) {
    int[][] intervals = {
            {1, 3},
            {6, 9}
        };

        int[] newInterval = {2, 5};

        int[][] result = insert(intervals, newInterval);

        System.out.println("Merged intervals:");
        for (int[] arr : result) {
            System.out.println(Arrays.toString(arr));
        }
  }
}
