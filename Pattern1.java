import java.util.*;
public class Pattern1 {
  public static void main(String[] args) {
    // 1               1
    //   2           2
    //     3       3
    //       4   4
    //         5 
    //       4   4
    //     3       3
    //   2           2
    // 1               1
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      for(int i=1;i<=n;i++){
        for(int j=1;j<i;j++){
          System.out.print(" ");
        }
        System.out.print(i);
        int midspace=2*(n-i)-1;
        if(midspace>0){
          for(int k=1;k<=midspace;k++){
            System.out.print(" ");
          }
          System.out.println(i);
        }

      }
      System.out.println();
      for(int i=n-1;i>=1;i--){
        for(int j=1;j<i;j++){
          System.out.print(" ");
        }
        System.out.print(i);
        int midspace=2*(n-i)-1;
        if(midspace>0){
          for(int k=1;k<=midspace;k++){
            System.out.print(" ");
          }
          System.out.println(i);
      }
  }
}
}
