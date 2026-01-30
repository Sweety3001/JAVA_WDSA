public class Q3 {
  public static void main(String[] args) {
    String str="sweety kunu";
    String[] arr=str.trim().split("\\s+");
    for(String s:arr){
      
      for(int j=s.length()-1;j>=0;j--){
        System.out.print(s.charAt(j));
      }
      System.out.print(" ");
    }
  }
}
