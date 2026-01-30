public class sumOfDigit{
  public static void main(String[] args) {
    int n=12050619;
    // int x=12506019;
    int sum=0;
    int product=1;
    int nonP=1;
    while(n!=0){
      sum=sum+(n%10);
      product=product*(n%10);
      int r=n%10;
      if(r!=0){
        nonP=nonP*r;
      }
      n=n/10;
    }
    System.out.println("sum:"+sum);
    System.out.println("Product:"+product);
    System.out.println("Product of non zero digit: "+ nonP);
  }
}