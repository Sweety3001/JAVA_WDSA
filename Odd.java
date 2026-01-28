public class Odd {
  public static void main(String[] args) {
      int a=5;
      // if((a & 1)==0){
      //   System.out.println("Even");
      // }else{
      //   System.out.println("Odd");
      // }

      int s=a/2;
      if((s*2)==a){
        System.out.println("Even");
      }else{
        System.out.println("Odd");
      }
  }
}
