public class Q1{
  public static void main(String[] args) {
    String str="SweeTy";
    String res=new String();
    for(int i=0;i<str.length();i++){
      //a-z(97-122)
      //A-Z(65-90)
      int ch=(int)(str.charAt(i));
      if(ch<=90){
        ch+=32;
      }else{
        ch-=32;
      }
      res=res+((char)ch);
    }
    System.out.println(res);
  }
}
