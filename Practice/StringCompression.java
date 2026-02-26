public class StringCompression {
  public static void main(String[] args) {
      char[] c={'a','b','b','c','c','c'};
      int n=c.length;
      int index=0;
      int i=0;
      while(i<n){
        int count=0;
        char ch=c[i];
        while(i<n && c[i]==ch){
          i++;
          count++;
        }
        c[index++]=ch;
        if(count>1){
          String s=String.valueOf(count);
          for(char x:s.toCharArray()){
            c[index++]=x;
          }
        }
      }
      System.out.println("Length of new array: "+index);
      for(int j=0;j<index;j++){
        System.out.print(c[j]);
      }
  }
}
