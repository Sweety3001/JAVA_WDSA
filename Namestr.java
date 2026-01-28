public class Namestr {
  public static void main(String[] args) {
      String name="Sweety";
      // System.out.println(name);
      // String res="";
      // int n=name.length();
      // for(int i=n-1;i>=0;i--){
      //   res+=name.charAt(i);
      // }
      // System.out.println(res);

      String res= new StringBuilder(name).reverse().toString();

      System.out.println(res);
  }
}

